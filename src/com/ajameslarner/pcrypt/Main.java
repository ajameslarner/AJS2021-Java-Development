package com.ajameslarner.pcrypt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<EncryptInput> newAccount = new ArrayList<>();
        String[][] newEncryption = {{"platform","email","username","password"}};

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your Platform: ");
            String scanPlatform = scanner.nextLine();

            System.out.println("Please enter your Email: ");
            String scanEmail = scanner.nextLine();

            System.out.println("Please enter your Username: ");
            String scanUsername = scanner.nextLine();

            System.out.println("Please Enter your Password: ");
            String scanPassword = scanner.nextLine();

            System.out.println("Please Enter your Encryption Key: ");
            int scanKey = scanner.nextInt();
            //Input validation will be done in the future for all

            //Constructors
            EncryptInput newInput = new EncryptInput(scanPlatform,scanEmail,scanUsername,scanPassword,"Substitution",scanKey);
            newAccount.add(newInput);
            DecryptInput deInput = new DecryptInput();

            //Encryption methods
            newInput.encodedEmail = newInput.caesarEncode(newInput.email, newInput.encryptKey);
            newInput.encodedUsername = newInput.caesarEncode(newInput.username, newInput.encryptKey);
            newInput.encodedPassword = newInput.caesarEncode(newInput.password, newInput.encryptKey);
            System.out.println("You data has been encrypted.");

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
                    System.out.println("Would you like to DECODE THIS? (y/n) ");
                    String entryDecode = entryDecodeScan.nextLine();
                    if (entryDecode.equals("y")) {
                        for (int i = 0; i < 1; i++){
                            System.out.println("Decoded credentials for: " + newEncryption[entryID][i]);
                        }
                        for (int i = 1; i < newEncryption[entryID].length; i++){
                            deInput.decodedInput = newEncryption[entryID][i];
                            deInput.decodedInput = deInput.caesarDecode(deInput.decodedInput, newInput.encryptKey);
                            System.out.println(deInput.decodedInput);
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
