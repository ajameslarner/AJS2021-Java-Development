package com.ajameslarner;

public class Strings {
    public static void main(String[] args) {

        //Strings
        String greeting = "Hi there!";
        System.out.println(greeting);

        String longText = "This is a long sentence that will demonstrate the length function.";
        System.out.println(longText.length()); //This will output the characters used including spaces.

        String caseSense = "Character case testing.";
        System.out.println(caseSense.toLowerCase());
        System.out.println(caseSense.toUpperCase());

        String indexFunc = "This is a index location test.";
        System.out.println(indexFunc.indexOf("a"));         //outputs the position at which this character first appears (8)
        System.out.println(indexFunc.indexOf("index"));     //outputs the position at which this string first appears (10)

        String firstName = "Anthony";
        String lastName = "Larner";
        System.out.println(firstName + " James " + lastName);
        System.out.println(firstName.concat(" James " + lastName));

        //Special characters
        String specialChar1 = "This is a 'quote' character test";   //Single quotes can be used freely
        String specialChar2 = "This is a \"quote\" character test"; //double quotes need an "escape" character to avoid an error
        String specialChar3 = "This is a \\quote\\ character test"; //backslashes need the escape character to be used in a string (might be useful to know for storing web addresses)
        System.out.println(specialChar1);
        System.out.println(specialChar2);
        System.out.println(specialChar3);
        String engTxt = "It's a test";

        //Escape characters
        String newLine = "Hello \n This is a test";         //Make a new line
        String carReturn = "Hello \r This is a test";       //Carriage return key
        String tab = "Hello \t This is a test";             //Tab
        String backspace = "Hello \b This is a test";       //Backspace
        String formFeed = "Hello \f This is a test";        //Form feed
        System.out.println(newLine);
        System.out.println(carReturn);
        System.out.println(tab);
        System.out.println(backspace);
        System.out.println(formFeed);

        //Adding strings
        String x = "20";
        String y = "21";
        String z = "The year is: " + x + y;
        System.out.println(z);

        String a = "20";
        int b = 21;
        String c = x + y;
        System.out.println(c);  //You can add strings to numeric variables (will become strings - cannot do string to numeric)

        //All string methods can be found here: https://www.w3schools.com/java/java_ref_string.asp

    }
}
