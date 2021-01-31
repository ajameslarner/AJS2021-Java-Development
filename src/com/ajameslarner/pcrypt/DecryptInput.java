package com.ajameslarner.pcrypt;

public class DecryptInput {
    //Decoding
    String decodedInput;

    //Decrypt Method
    public String caesarDecode(String msg, int deKey ) {

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
}
