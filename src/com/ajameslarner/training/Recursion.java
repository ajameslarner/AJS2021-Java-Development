package com.ajameslarner.training;

public class Recursion {
    //Recursion is the act of making a function call itself

    public static void main(String[] args) {

        int result = recSum(12345);
        System.out.println(result);
    }

    //This "recursive" method calls itself within the operation and adds all the digits in 10 together ( 1 + 2 + 3 + 4...)
    public static int recSum(int x) {
        if (x > 0) {
            return x + recSum(x - 1);
        } else {
            return 0;   //HALTING CONDITION - VERY IMPORTANT
        }
    }

    //NOTE
    //Recursive methods sound very interested - further reading
}
