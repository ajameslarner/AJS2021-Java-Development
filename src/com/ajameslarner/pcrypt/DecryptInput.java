package com.ajameslarner.pcrypt;

import java.io.UnsupportedEncodingException;

public class DecryptInput {
    //Decoding
    String decodedInput;

    //Decrypt Method
    public String caesarDecrypt(String msg, int deKey ) {

        char[] msgArray = msg.toCharArray();
        StringBuilder reverse = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int z;
        for (z = 32; z <= 126; z++) {
            reverse.append((char)z);
        }
        char[] ASCII = reverse.reverse().toString().toCharArray();

        //I reversed the alphabet and performed the same substitution process because the modulus operator doesn't function with negative numbers in Java.
        //char[] dictionary = new StringBuilder(String.valueOf(alphabet)).reverse().toString().toCharArray();

        for (int x = 0; x < msgArray.length; x++) {
            for (int y = 0; y < 95; y++) {
                if (ASCII[y] == msgArray[x]) {
                    int index = y;
                    index += deKey;
                    index %= 95;
                    result.append(ASCII[index]);
                    //result.append(dictionary[index]);
                    //System.out.println(index);        //Testing
                    //System.out.println("Match! Pos: " + y);   //Testing
                    continue;
                }
            }
        }
        //char[] dictionary = new StringBuilder(reverse).toString().toCharArray();
        return result.toString();
    }

    public String base16Decode(String msg, int enKey) throws UnsupportedEncodingException {

        char[] msgArray = msg.toCharArray();
        StringBuilder reverse = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int z;
        for (z = 32; z <= 126; z++) {
            reverse.append((char)z);
        }
        char[] ASCII = reverse.reverse().toString().toCharArray();
        byte[] binValues = reverse.toString().getBytes("UTF-8");

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
