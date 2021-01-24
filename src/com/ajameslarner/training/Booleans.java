package com.ajameslarner.training;

import javax.sound.midi.SysexMessage;

public class Booleans {
    public static void main (String[] args) {
        boolean thisTrue = true;
        boolean thisFalse = false;

        System.out.println(thisTrue);   //Outputs true
        System.out.println(thisFalse);  //Outputs false

        int x = 5;
        int y = 2;

        //Logical comparisons output boolean results
        System.out.println(x > y);      //Outputs TRUE because the statement is true
        System.out.println(x < y);      //Outputs FALSE because the statement is false
        System.out.println(x == 5);     //Outputs TRUE because the state is true
        System.out.println(x != 5);     //Outputs FALSE because the state is false

        //comparative operators can be used to compare values and will return a boolean statement

    }
}
