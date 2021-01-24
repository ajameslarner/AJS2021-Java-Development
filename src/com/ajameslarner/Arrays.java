package com.ajameslarner;

public class Arrays {
    public static void main(String[] args) {

        //Arrays
        //To declare an array you would add [] to the variable upon initialisation

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //String Array

        int[] count = {1,2,3,4,5,6,7,8,9,10};   //int Array

        //Accessing an array element
        System.out.println(days[2]);        //Outputs wednesday 0-6 (0 is inclusive in an array as always)

        //Modify individual elements in an array
        days[2] = "Wed";
        System.out.println(days[2]);

        //Output array length
        System.out.println(days.length);    //Outputs the length of the array in digits (7)

        //Foreach should be used to loop through an array
        //however you can use a for loop and use the .length as the counter benchmark
        for (int y = 0; y < days.length; y++) {
            System.out.println(days[y]);        //Y gives the array element number because it loops through from 0 the same as the arrays start
        }

        //MULTI-DIMENSIONAL ARRAYS TOMORROW!
    }
}
