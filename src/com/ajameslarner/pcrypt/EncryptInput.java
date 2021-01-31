package com.ajameslarner.pcrypt;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class EncryptInput {

    private static int entries = 1;

    public int uniqueID;
    String platform;
    String email;
    String username;
    String password;
    String encryptMethod;
    int encryptKey;

    //Encoding
    public String encodedEmail;
    public String encodedUsername;
    public String encodedPassword;

    //Constructor (stage 1)
    EncryptInput(String newPlatform, String newEmail, String newUsername, String newPassword, String method, int key) {

        uniqueID = entries++;
        platform = newPlatform;
        email = newEmail.toLowerCase();
        username = newUsername.toLowerCase();
        password = newPassword;
        encryptMethod = method;
        encryptKey = key;

        System.out.println("Your input has been successfully stored with a unique ID of: " + uniqueID);
        System.out.println("The " + method + " method has been successfully assigned.");
    }

    //Insert into array table (stage 3)
    public String[][] insertUser(String[][] arr, int amount, String[] data) {
        String[][] result = new String[arr.length + 1][];

        for (int i = 0; i < amount; i++) {
            result[i] = arr[i];
        }
        result[amount] = data;
        for (int i = amount + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    //Encrypt Method (stage 2)
    public String caesarEncode(String msg, int enKey) throws UnsupportedEncodingException {

        char[] msgArray = msg.toCharArray();
        StringBuilder forward = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int z;
        for (z = 32; z <= 126; z++) {
            forward.append((char) z);
        }
        char[] ASCII = forward.toString().toCharArray();

        for (int x = 0; x < msgArray.length; x++) {
            //New method using the ASCII output (char)i
            for (int y = 0; y < 95; y++) {
                if (ASCII[y] == msgArray[x]) {
                    int index = y;
                    index += enKey;
                    index %= 95;
                    result.append(ASCII[index]);
                    //System.out.println(alphabet[mod]);        //Testing
                    //System.out.println("Match! Pos: " + y);   //Testing
                    continue;
                }
            }
        }
        return result.toString();
    }

    public String base16Encode(String msg, int enKey) throws UnsupportedEncodingException {

        char[] msgArray = msg.toCharArray();
        StringBuilder forward = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int z;
        for (z = 32; z <= 126; z++) {
            forward.append((char) z);
        }
        byte[] binValues = forward.toString().getBytes("UTF-8");
        char[] ASCII = forward.toString().toCharArray();

        //char[] base16 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        for (int x = 0; x < msgArray.length; x++) {
            //New method using the ASCII output (char)i
            for (int y = 0; y < 95; y++) {
                if (ASCII[y] == msgArray[x]) {
                    int index = y;
                    index ^= enKey;
                    index %= 95;
                    result.append(ASCII[index]);
                    String padding = Integer.toBinaryString(binValues[index]);
                    if (padding.length() < 8) {
                        padding = "0" + padding;
                    }
                    System.out.println(padding + " ");
                    continue;
                }
            }
        }
        return result.toString();
    }
}
