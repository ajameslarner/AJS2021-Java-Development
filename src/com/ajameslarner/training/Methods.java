package com.ajameslarner.training;

import java.util.Locale;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        //Methods are considered "functions" essentially
        //Data can be passed into them, known as parameters or arguments

        //Methods are essentially blocks of code that can be reused and called upon when needed
        //Methods must be defined within a class

        standardMethod();   //Returns "Method execution test!" - see below

        String name = "Anthony";
        singleParMethod(name);

        String fname = "Anthony";
        char[] initials = {'A','J','S','L'};
        int age = 25;
        multiParMethod(fname,initials,age);

        int x = 2323;
        int y = 433;
        int resReturn = returnMethod(x,y);
        System.out.println(resReturn);
        System.out.println(returnMethod(x,y));  //Shorter version to achieve the same output

        logicMethod(56);    //value can be passed instead of variables like previous examples

        //OVERLOADING METHODS TO TAKE MULTIPLE INPUTS
        String answer = "London";

        System.out.println(overMethod(4,5));
        System.out.println(overMethod(4.5,43.4));
        System.out.println(overMethod(answer));     //Returning wrong because lowercase method not working? look into

        Scanner msg = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age: ");
            int inputAge = msg.nextInt();
            logicMethod(inputAge);              //testing - just added it into a while loop and requested user input to test the method
        }




        //So
        //the variables in the methods DO NOT need to be the same variables, just the same format (int var1 > int var2 in the method)
        //the method simply performs the logic with the values passed through, whether that's from variables or values directly embedded.


    }

    static void standardMethod() {

        //Static means this method belongs to the Method class (this class and cannot be called elsewhere?)
        //Void means nothing is returned as a result of the execution

        System.out.println("Method execution test!");
    }

    static void singleParMethod(String x) {

        //Static means this method belongs to the Method class (this class and cannot be called elsewhere?)
        //Void means nothing is returned as a result of the execution
        System.out.println(x + " < this is a passed variable, when it was called.");
    }

    static void multiParMethod(String x, char[] y, int z) {
        System.out.println("My name is: " + x);
        System.out.print("My initials are: ");
        for (char a: y) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("My age is: " + z);
    }

    static int returnMethod(int x, int y){
        int z = x + y;
        z *= x;
        z /= y;
        return z;
    }

    static void logicMethod(int x) {
        //This method will test if the variable passed is over 18

        //IF STATEMENT
        if (x < 18) {
            System.out.println(x + " is not old enough!");
        } else if (x >= 18) {
            System.out.println(x + " - You are old enough to drink!");
        }

        //SWITCH CASE - Easter egg
        switch (x) {
            case 100:
                System.out.println("YOU SHOULD NOT BE DRINKING AT THIS AGE!");
                break;
            case 1:
                System.out.println("YOU CANNOT EVEN TALK YET?!?!");
            default:
        }
    }

    //OVERLOADING METHODS
    //Multiple methods can have the same name as long as the parameters are different - this is why there are multiples of the same in the "var1." menu

    static int overMethod(int x, int y){
        return x + y;
    }

    static double overMethod(double x, double y) {
        return x + y;
    }

    static String overMethod(String x){
        String z = "";
        if (x == "london") {
            z = "Correct!";
        } else {
            z = "Wrong!";
        }
        return z;
    }

    //SO above we have 3 methods with the same name however take different inputs, this is useful to avoid writing new methods with different names which do similar stuff but slightly different
}
