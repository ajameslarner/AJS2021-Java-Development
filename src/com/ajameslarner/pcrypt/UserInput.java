package com.ajameslarner.pcrypt;

public class UserInput {

    private static int entries = 1;

    int uniqueID ;
    String platform;
    String email;
    String username;
    String password;
    String encryptMethod;
    int encryptKey;

    //Encoding
    String encodedEmail;
    String encodedUsername;
    String encodedPassword;

    //Decoding
    String decodedEmail;
    String decodedUsername;
    String decodedPassword;


    UserInput(String newPlatform, String newEmail, String newUsername, String newPassword) {
        platform = newPlatform;
        email = newEmail.toLowerCase();;
        username = newUsername.toLowerCase();
        password = newPassword;
        uniqueID = entries++;

        System.out.println("Your input has been successfully stored with a unique ID of: " + uniqueID);
    }

    public void encryptionMethod(String method, int key) {
        encryptMethod = method;
        encryptKey = key;

        System.out.println("The encryption method has been successfully assigned.");
    }
}
