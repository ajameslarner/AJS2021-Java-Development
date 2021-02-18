package com.ajameslarner.pcrypt;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        List<EncryptInput> newAccount = new ArrayList<>();
        String[][] newEncryption = {{"platform","email","username","password"}};

        EncryptInput keyGen = new EncryptInput();
        int[] p = keyGen.getSubKeys(18); //32bit sub-keys (p-array)

        for (int i = 0; i < p.length; i++){
            System.out.println(Integer.toHexString(p[i]));
        }

        //InputKey
        long inputKey = keyGen.getInputKey();
        //System.out.println(Long.toHexString(inputKey));
        keyGen.preProcessKeys(p, inputKey);








        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your Platform: ");
            //String scanPlatform = scanner.nextLine();
            String scanPlatform = scanner.nextLine();

            System.out.println("Please enter your Email: ");
            String scanEmail = scanner.nextLine();

            System.out.println("Please enter your Username: ");
            String scanUsername = scanner.nextLine();

            System.out.println("Please Enter your Password: ");
            String scanPassword = scanner.nextLine();

            System.out.println("Please Enter your Encryption Method: ");
            String scanMethod = scanner.nextLine();

            System.out.println("Please Enter your Encryption Key: ");
            int scanKey = scanner.nextInt();
            //Input validation will be done in the future for all

            //Constructors
            EncryptInput newInput = new EncryptInput(scanPlatform,scanEmail,scanUsername,scanPassword,scanMethod,scanKey);
            newAccount.add(newInput);
            DecryptInput deInput = new DecryptInput();


            if (scanMethod.equals("sub")) {
                newInput.encodedEmail = newInput.caesarEncode(newInput.email, newInput.encryptKey);
                newInput.encodedUsername = newInput.caesarEncode(newInput.username, newInput.encryptKey);
                newInput.encodedPassword = newInput.caesarEncode(newInput.password, newInput.encryptKey);
                System.out.println("You data has been encrypted.");
            } else if (scanMethod.equals("bin")) {
                newInput.encodedEmail = newInput.base16Encode(newInput.email, newInput.encryptKey);
                newInput.encodedUsername = newInput.base16Encode(newInput.username, newInput.encryptKey);
                newInput.encodedPassword = newInput.base16Encode(newInput.password, newInput.encryptKey);
                System.out.println("You data has been encrypted.");
            }

            //Encryption methods


            //Store data into array table
            newEncryption = newInput.insertUser(newEncryption, newInput.uniqueID, new String[]{scanPlatform,newInput.encodedEmail,newInput.encodedUsername,newInput.encodedPassword});

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
                        for (int i = 0; i < 1; i++){
                            System.out.println("Decoded credentials for: " + newEncryption[entryID][i]);
                        }

                        if (scanMethod.equals("sub")) {
                            for (int i = 1; i < newEncryption[entryID].length; i++){
                                deInput.decodedInput = newEncryption[entryID][i];
                                deInput.decodedInput = deInput.caesarDecode(deInput.decodedInput, newInput.encryptKey);
                                System.out.println(deInput.decodedInput);
                            }
                            System.out.println("You data has been encrypted.");
                        } else if (scanMethod.equals("bin")) {
                            for (int i = 1; i < newEncryption[entryID].length; i++){
                                deInput.decodedInput = newEncryption[entryID][i];
                                deInput.decodedInput = deInput.base16Decode(deInput.decodedInput, newInput.encryptKey);
                                System.out.println(deInput.decodedInput);
                            }
                            System.out.println("You data has been encrypted.");
                        }
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
}
