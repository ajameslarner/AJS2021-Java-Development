package com.ajameslarner.pcrypt;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public class EncryptInput {

    private static int entries = 1;

    //Inputs
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

    public EncryptInput() {}

    //Insert into array table (stage 3)
    public String[][] insertAccount(String[][] arr, int amount, String[] data) {
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
    public String CaesarEncrypt(String msg, int enKey) throws UnsupportedEncodingException {

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

    public String Sha2Encrypt(String msg, long[] subkeys) throws UnsupportedEncodingException {

        System.out.println("Data to Encrypt: " + msg);
        char[] msgArray = msg.toCharArray();
        StringBuilder forward = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int z;
        for (z = 32; z <= 126; z++) {
            forward.append((char) z);
        }

        byte[] binValues = forward.toString().getBytes("UTF-8");
        char[] ASCII = forward.toString().toCharArray();

        //char[] base16 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; OLD

        for (int x = 0; x < msgArray.length; x++) {
            //New method using the ASCII output (char)i
            result.append(msgArray[x] + "|");
            for (int y = 0; y < 95; y++) {
                if (ASCII[y] == msgArray[x]) {
                    int index = y;

                    String binOut = Integer.toBinaryString(binValues[index]);
                    if (binOut.length() < 8) {
                        binOut = "0" + binOut;
                    }

                    result.append(binOut);
                    break;
                }
            }
            result.append("|");
        }
        return result.toString();
    }

    //NOTES: the bin encrypt is using the key value and substituting the characters then converting to binary!

    public long getInputKey() {
        SecureRandom ranSecure = new SecureRandom();
        return ranSecure.nextLong();
    }

    public long[] getSubKeys(int amount) {

        long[] subKeys = new long[amount];
        SecureRandom ranSecure = new SecureRandom();

        for (int i=0; i < amount; i++) {
            subKeys[i] = ranSecure.nextLong();
        }
        return subKeys;
    }

    static void convertBinary(int decimal) {

        int[] binaryArray = new int[8];



    }

    public static void toBinary(int decimal, int amount){
        int binary[] = new int[amount];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
            if (binary[index] < 8 ){

            }
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public void preProcessKeys(int[] subKey, long inputKey) {

        long[] roundOne = new long[0];
        long[] roundTwo = new long[0];
        long[] roundThree = new long[0];
        long[] roundFour = new long[0];

        for (int i=0; i< subKey.length; i++) {
            roundOne[i] = subKey[i] ^= inputKey;
        }
        for (int j=0; j<subKey.length; j++) {
            roundTwo[j] = roundOne[j] *= inputKey;
        }
        for (int x=0; x<subKey.length; x++) {
            roundThree[x] = roundTwo[x] *= inputKey;
        }
        for (int l=0; l<subKey.length; l++) {
            roundFour[l] = roundThree[l] *= inputKey;
        }
        for (long o: roundFour) {
            //o %= 32;
            System.out.println(Long.toHexString(o));
        }

    }



}
