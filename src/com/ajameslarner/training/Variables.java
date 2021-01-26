package com.ajameslarner.training;

public class Variables {

    //Attributes for the OOP file
    int age;
    String color;
    char initial;



    public static void main(String[] args) {
        //Numeric variables
        //byte stores 1 byte of digits (127 +/-)
        byte a = 1;
        System.out.println("This is a byte variable: " + a);
        //short stores 2 bytes of digits (32,767 +/-)
        short b = 32000;
        System.out.println("This is a short variable: " + b);
        //int stores 4 bytes of digits (2,147,483,648 +/-)
        int c = 2000000000;
        System.out.println("This is a int variable: " + c);
        //long stores 8 bytes of digits (9,223,372,036,854,775,808 +/-) - "L" must be added to the end.
        long d = 92288889999999998L;
        System.out.println("This is a long variable: " + d);

        //Floating point variables
        //float stores 4 bytes of digits (2,147,483,648 +/-) - "f" must be added to the end
        float e = 19.99f;
        System.out.println("This is a float variable: " + e);
        //double stores 4 bytes of digits (2,147,483,648 +/-) - "d" must be added to the end
        double f = 19.99203233423d;
        System.out.println("This is a double variable: " + f);
        //These two variables can also be stored with an "e" to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("This is a float variable: " + f1);
        System.out.println("This is a double variable: " + d1);

        //Boolean variables
        //Boolean stores "true" or "false" values
        boolean varTrue = true;
        boolean varFalse = false;
        System.out.println("This sta44tement is true: " + varTrue);
        System.out.println("This statement is false: " + varFalse);

        //Character variables
        //char stores SINGLE characters with '' quotations
        char myInitial = 'A';
        System.out.println("This character is: " + myInitial);
        //Alternatively you can store characters in ASCII format
        char myASCII = 64;
        System.out.println("This ASCII value is: " + myASCII);
        //string is used to store a sequence of characters, surrounded by "" double quotes, also uppercase S
        String myName = "Anthony Larner";
        System.out.println("My name is: " + myName);

        //These are all the primitive data types in Java, they can be identified by lower case characters.
        System.out.println("These are all values of primitive data type variables.");
        //Type casting - converting values of variables into another data types
        //Widening casting
        int exampleInt1 = 5;
        double exampleDouble1 = exampleInt1;

        System.out.println("This is a normal int: " + exampleInt1);
        System.out.println("This is an converted int to double: " + exampleDouble1);
        System.out.println("This is an example of automatic casting when widening the number.");

        //Narrowing casting
        double exampleDouble2 = 43.934343;
        int exampleInt2 = (int) exampleDouble2;

        System.out.println("This is a normal double: " + exampleDouble2);
        System.out.println("This is a converted double to int: " + exampleInt2);
        System.out.println("This is an example of manual casting when narrowing the number.");
        //Does not round, only removes the decimal places.
    }
}
