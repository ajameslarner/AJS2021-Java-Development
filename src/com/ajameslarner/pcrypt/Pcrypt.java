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
    static long[] keys;

    static String RegExAlphabet = "[^ ]";

    public static void main(String[] args) throws UnsupportedEncodingException {

        //Constructors
        Pcrypt data = new Pcrypt();
        List<EncryptInput> newAccount = new ArrayList<>();
        String[][] newEncryption = {{"platform","email","username","password"}};
        EncryptInput keyGen = new EncryptInput();// Subkey init
        DecryptInput deInput = new DecryptInput();

        //keyGen.toBinary(345, 40);

        while (true) {

            //Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your Platform:");
            data.Platform = data.RegExCheck("Platform", RegExAlphabet);

            System.out.println("Please enter your Email:");
            data.Email = data.stringInputCheck("Email","[abc]");

            System.out.println("Please enter your Username:");
            data.Username = data.stringInputCheck("Username","[abc]");

            System.out.println("Please enter your Password:");
            data.Password = data.stringInputCheck("Password","[abc]");

            System.out.println("Please enter your Encryption Method:");
            data.Method = data.stringInputCheck("Method","[abc]");


            int Key = 0;
            if (Method.equals("sub")) {
                System.out.println("Please enter your Encryption Key: ");
                Key = data.intInputCheck("Key");
            }

            if (Method.equals("sha2")) {
                System.out.println("Please choose your required amount of keys: ");
                int amount = data.intInputCheck("Subkey Count");
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
            newAccount.add(newInput);

            if (data.Method.equals("sub")) {
                newInput.encodedEmail = newInput.CaesarEncrypt(newInput.email, newInput.encryptKey);
                newInput.encodedUsername = newInput.CaesarEncrypt(newInput.username, newInput.encryptKey);
                newInput.encodedPassword = newInput.CaesarEncrypt(newInput.password, newInput.encryptKey);
                System.out.println("You data has been encrypted.");
                //newEncryption = newInput.insertAccount(newEncryption, newInput.uniqueID, new String[]{newInput.platform,newInput.encodedEmail,newInput.encodedUsername,newInput.encodedPassword});
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
                    System.out.println("Would you like to decode this? (y/n) ");
                    String entryDecode = entryDecodeScan.nextLine();
                    if (entryDecode.equals("y")) {
                        //for (int i = 0; i < 1; i++){
                        //    System.out.println("Decoded credentials for: " + newEncryption[entryID][i]);
                        //}
//
                        //if (newInput.encryptMethod.equals("sub")) {
                        //    for (int i = 1; i < newEncryption[entryID].length; i++){
                        //        deInput.decodedInput = newEncryption[entryID][i];
                        //        deInput.decodedInput = deInput.caesarDecode(deInput.decodedInput, newInput.encryptKey);
                        //        System.out.println(deInput.decodedInput);
                        //    }
                        //    System.out.println("You data has been decrypted.");
                        //} else if (newInput.encryptMethod.equals("bin")) {
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

    private String stringInputCheck(String widget, String RegEx) {
        Scanner scanner = new Scanner(System.in);

        String msg;
        do {
            System.out.print(widget+": ");
            while (!scanner.hasNext(RegEx)) {
                String input = scanner.next();
                System.out.println(input + " is not valid. Please try again.");
                System.out.print(widget+": ");
            }
            msg = scanner.next();
        } while (msg.isEmpty());

        return msg;
    }

    private int intInputCheck(String widget) {
        Scanner scanner = new Scanner(System.in);

        Integer num;
        do {
            System.out.print(widget+": ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " is not valid. Please try again.");
            }
            num = scanner.nextInt();

        } while (num.equals(0));

        return num;
    }

    private String RegExCheck(String msg, String RegEx) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(msg+": ");
            Pattern pattern = Pattern.compile(RegEx, Pattern.CASE_INSENSITIVE);
            Matcher match = pattern.matcher(msg);

            while (!scanner.hasNext()) {
                String input = scanner.next();
                boolean isMatched = match.find();
                if (!isMatched){
                    msg = "Invalid Input";
                } else {
                    msg = "Input stored.";
                }

                return msg;
            }
            msg = scanner.next();
        } while (msg.isEmpty());


        return msg;
    }
}
