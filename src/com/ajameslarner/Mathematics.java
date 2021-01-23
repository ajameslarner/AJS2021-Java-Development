package com.ajameslarner;

public class Mathematics {
    public static void main(String[] args) {

        //Mathematical Operations
        Math.max(5,10);     //Returns the highest value (10)
        Math.min(5,10);     //Returns the lowest value (5)

        int x = 45;
        Math.sqrt(x);       //Returns the square root of x (6.7082039324993690892275210061938)
        Math.abs(x);        //Returns the absolute value of a character (45) the amount of steps away from 0 - if it is -45 it will still be 45

        //Random Number Generator
        Math.random();      //Root function returns a random value between 0.0 and 1.0

        int randomNum = (int)(Math.random() * 101);     //Returns a random number between 1 and 100
        System.out.println(randomNum);
    }
}
