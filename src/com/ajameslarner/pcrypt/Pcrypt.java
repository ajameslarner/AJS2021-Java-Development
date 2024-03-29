package com.ajameslarner.pcrypt;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pcrypt {

    static String Platform;
    static String Email;
    static String Username;
    static String Password;
    static String Method;

    static int Key;

    //Subkeys
    static long[] keys;

    static String[] regExConditions = {"","[a-z0-9]","@","sub|sha2","[0-9]"};
    static String[] regExError = {"","Only characters (a-z) and digits (0-9) accepted.","Please enter a valid email address.","Please enter \"sub\" for Substitution Encryption or \"sha2\" for Binary Encryption.","Only digits between 0-9 are accepted."};

    public static void main(String[] args) throws UnsupportedEncodingException {

        //Constructors
        List<EncryptInput> AccountList = new ArrayList<>();
        String[][] newEncryption = {{"platform","email","username","password"}};
        EncryptInput keyGen = new EncryptInput();// Subkey init
        DecryptInput deInput = new DecryptInput();

        //keyGen.toBinary(345, 40);

        while (true) {

            Pcrypt data = new Pcrypt();

            System.out.println("Please enter your Platform:");
            data.Platform = data.RegExCheckString("Platform", regExConditions[1], regExError[1]);

            System.out.println("Please enter your Email:");
            data.Email = data.RegExCheckString("Email",regExConditions[2],regExError[2]);

            System.out.println("Please enter your Username:");
            data.Username = data.RegExCheckString("Username",regExConditions[0], regExError[0]);

            System.out.println("Please enter your Password:");
            data.Password = data.RegExCheckString("Password",regExConditions[0], regExError[0]);

            System.out.println("Please enter your Encryption Method:");
            data.Method = data.RegExCheckString("Method",regExConditions[3], regExError[3]);

            if (Method.equals("sub")) {
                System.out.println("Please enter your Encryption Key: ");
                data.Key = data.RegExCheckInt("Key");
            }

            if (Method.equals("sha2")) {
                System.out.println("Please choose your required amount of keys: ");
                int amount = data.RegExCheckInt("Sub-key Count");
                keys = keyGen.getSubKeys(amount); //32bit sub-keys (p-array)

                for (long l : keys) {
                    System.out.println(Long.toHexString(l));
                }

                //InputKey
                //long inputKey = keyGen.getInputKey();
                //System.out.println(Long.toHexString(inputKey));
                //keyGen.preProcessKeys(p, inputKey);
            }

            EncryptInput newInput = new EncryptInput(Platform,Email,Username,Password,Method,Key);
            AccountList.add(newInput);

            if (data.Method.equals("sub")) {
                newInput.encodedEmail = newInput.CaesarEncrypt(newInput.email, newInput.encryptKey);
                newInput.encodedUsername = newInput.CaesarEncrypt(newInput.username, newInput.encryptKey);
                newInput.encodedPassword = newInput.CaesarEncrypt(newInput.password, newInput.encryptKey);
                System.out.println("You data has been encrypted.");
            } else if (data.Method.equals("sha2")) {
                newInput.encodedEmail = newInput.Sha2Encrypt(newInput.email, keys);
                newInput.encodedUsername = newInput.Sha2Encrypt(newInput.username, keys);
                newInput.encodedPassword = newInput.Sha2Encrypt(newInput.password, keys);
                System.out.println("You data has been encrypted.");
            }

            newEncryption = newInput.insertAccount(newEncryption, newInput.uniqueID, new String[]{newInput.platform,newInput.encodedEmail,newInput.encodedUsername,newInput.encodedPassword});

            //Notes
            //Input validation needed

            //Encryption methods

            //Store data into array table
            Scanner entryViewScan = new Scanner(System.in);
            Scanner entryIDScan = new Scanner(System.in);
            Scanner entryDecodeScan = new Scanner(System.in);

            while (true) {
                System.out.println("Would you like to view an entry? (y/n) ");
                String entryView = entryViewScan.nextLine();

                if (entryView.equals("y")) {
                    System.out.println("Please enter the Unique ID: ");
                    int entryID = entryIDScan.nextInt();
                    System.out.println(Arrays.deepToString(newEncryption[entryID]));
                    System.out.println("Would you like to decrypt this? (y/n) ");
                    String entryDecode = entryDecodeScan.nextLine();
                    if (entryDecode.equals("y")) {
                        for (int i = 0; i < 1; i++){
                            System.out.println("Decoded credentials for: " + newEncryption[entryID][i]);
                        }

                        if (newInput.encryptMethod.equals("sub")) {
                            for (int i = 1; i < newEncryption[entryID].length; i++){
                                deInput.decodedInput = newEncryption[entryID][i];
                                deInput.decodedInput = deInput.caesarDecrypt(deInput.decodedInput, newInput.encryptKey);
                                System.out.println(deInput.decodedInput);
                            }
                            System.out.println("You data has been decrypted.");
                        }// else if (newInput.encryptMethod.equals("bin")) {
                        //    for (int i = 1; i < newEncryption[entryID].length; i++){
                        //        deInput.decodedInput = newEncryption[entryID][i];
                        //        deInput.decodedInput = deInput.base16Decode(deInput.decodedInput, newInput.encryptKey);
                        //        System.out.println(deInput.decodedInput);
                        //    }
                        //    System.out.println("You data has been decrypted.");
                        //}
                    } else if (entryDecode.equals("n")) {
                        System.out.println("You chose no.");
                        break;
                    }
                } else if (entryView.equals("n")) {
                    System.out.println("You chose to exit.");
                    break;
                }
            }
        }
    }

    private String RegExCheckString(String widget, String RegEx, String errorException) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(widget+": ");
        String input = scanner.next();

        String status;
        boolean isMatched;

        do {

            Pattern pattern = Pattern.compile(RegEx, Pattern.CASE_INSENSITIVE);
            Matcher match = pattern.matcher(input);

            isMatched = match.find();
            if (!isMatched){
                status = "Invalid Input. " + errorException;
                System.out.println(status);
                System.out.print(widget+": ");
                input = scanner.next();
            } else {
                status = "Input stored.";
                System.out.println(status);
            }

        } while (!isMatched);

        return input;
    }

    private int RegExCheckInt(String widget) {

        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.print(widget+": ");
            while (!scanner.hasNextInt()){
                String input = scanner.next();
                System.out.println("\""+input+"\"" + " is not a valid input.");
                System.out.print(widget+": ");
            }
            num = scanner.nextInt();

        } while (num < 0);

        return num;
    }
}
