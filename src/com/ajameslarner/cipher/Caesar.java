package com.ajameslarner.cipher;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {

        //Alphabet Init
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] base10 = {0,1,2,3,4,5,6,7,8,9};

        //User inputs
        Scanner msg = new Scanner(System.in);
        Scanner key = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your message: ");
            String inputMsg = msg.nextLine();
            System.out.println("Enter your encryption key: ");
            int inputKey = key.nextInt();
            //Formatting for comparison
            inputMsg = inputMsg.toLowerCase();
            //To array for iteration
            char[] inputTextArray = inputMsg.toCharArray();
            System.out.println("Encryption: " + encrypt(inputTextArray, alphabet, inputKey));
        }
    }

    static StringBuilder encrypt(char[] msg, char[] charPos, int enKey ) {

        StringBuilder result = new StringBuilder();

        for (int x = 0; x < msg.length; x++){
            for (int y = 0; y < charPos.length; y++) {
                if (charPos[y] == msg[x]) {
                    int mod = y;
                    mod += enKey;
                    mod %= 26;
                    result.append(charPos[mod]);
                    //System.out.println(alphabet[mod]);        //Testing
                    //System.out.println("Match! Pos: " + y);   //Testing
                    continue;
                }
            }
        }
        return result;
        //System.out.println(result);
    }
}
