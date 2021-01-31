package com.ajameslarner.pcrypt;

public class Ceasar {

                      //0   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25
    //char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public String caesarEncode(String msg, int enKey ) {

        char[] msgArray = msg.toCharArray();
        StringBuilder forward = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int z;
        for (z = 32; z <= 126; z++) {
            forward.append((char)z);
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
