package com.ajameslarner.training;

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

        //A multi dimensional array is an array consisting on rows and columns (2d array) - basically a table

        int[][] dimArray = {{1,2,3,3,21,3,1,233},{4,5,6,5,6,7,6,4,5,3,4}};

        int firstRow = dimArray[0][0];      //Outputs 1 (1st row being the 1st brackets which is 0 (array counts)
        int secondRow = dimArray[1][0];    //Outputs 4 (2nd row being the 2nd brackets which is 0 (array counts)

        System.out.println(firstRow);
        System.out.println(secondRow);

        String[][] dimArrayMulti = {{"a","a","a"},{"b","b"},{"c","c","c","c","c"}};     //Rows can be infinite, additional brackets
                                                                                                //Also variable type can be substituted like the example here (String)

        System.out.println(dimArrayMulti[0][2] + dimArrayMulti[1][1] + dimArrayMulti[2][3]);    //Called upon like this

        //How to loop through a multi 2d array
        int multiLoopArray[][] = {{0,0,0,0,0,0},{1,1,1,1,1,1,1,},{2,2,2,2,2,2},{3,3,3,3},{4,4,4,4,4,4,}}; //5 rows
        System.out.println(multiLoopArray.length);

        System.out.println("This is the multi-loop output START");
        for (int f = 0; f < multiLoopArray.length; f++) {           //Counts the length of the array columns (1st level/dimension)
            for (int g = 0; g < multiLoopArray[f].length; g++) {    //Using the index from "f" counts the length of the array rows (2nd level/dimension)
                System.out.println(multiLoopArray[f][g]);
            }
        }
        System.out.println("This is the multi-loop output END");
    }
}
