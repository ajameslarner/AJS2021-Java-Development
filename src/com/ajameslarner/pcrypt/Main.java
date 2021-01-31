package com.ajameslarner.pcrypt;

public class Main {
    public static void main(String[] args) {

        UserInput gmail = new UserInput("gmail", "anthony@gmail.com","This-is-a-long-message","letmein");
        gmail.encryptionMethod("substitution",5);

        Ceasar encryptInput = new Ceasar();

        System.out.println("This is your encrypted data");

        gmail.encodedEmail = encryptInput.caesarEncode(gmail.email, gmail.encryptKey);
        gmail.encodedUsername = encryptInput.caesarEncode(gmail.username, gmail.encryptKey);
        gmail.encodedPassword = encryptInput.caesarEncode(gmail.password, gmail.encryptKey);

        System.out.println(gmail.encodedEmail);
        System.out.println(gmail.encodedUsername);
        System.out.println(gmail.encodedPassword);

        gmail.decodedEmail = encryptInput.caesarDecode(gmail.encodedEmail, gmail.encryptKey);
        gmail.decodedUsername = encryptInput.caesarDecode(gmail.encodedUsername, gmail.encryptKey);
        gmail.decodedPassword = encryptInput.caesarDecode(gmail.encodedPassword, gmail.encryptKey);

        System.out.println(gmail.decodedEmail);
        System.out.println(gmail.decodedUsername);
        System.out.println(gmail.decodedPassword);
    }
}
