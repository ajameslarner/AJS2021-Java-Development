package com.ajameslarner.training;

public class Scope {
    //Scope is important to understand in any programing language
    //The scope refers to the ability for the variable to be read

    //If a variable is declared after its referred to it cannot be seen or is not within the "scope"

    public static void main(String[] args) {

        //EXAMPLE 1
        int var1 = 10;  //This variable is within the scope of this operation
        if (var1 == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        //EXAMPLE 2
        //if (var2 == 10) {
        //    System.out.println("True");
        //} else {
        //    System.out.println("False");
        //}
        //int var2 = 10;  //This variable is NOT within the scope of this operation because its after, code is read top down.
//
//
        ////EXAMPLE 3
        //int var3 = 10;
        //if (var3 == 10) {
        //    String res3 = "CORRECT!";
        //} else {
        //    System.out.println("False");
        //}
//
        //System.out.println(res3);   //This variable is NOT within the scope as its declared inside a code block.
                                    //to use the variable in this way it must be declared before the code block, out of it.
    }
}
