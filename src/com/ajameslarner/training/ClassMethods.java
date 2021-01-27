package com.ajameslarner.training;

public class ClassMethods {

    //OBJECT ATTRIBUTES/VARIABLES INITIALISATION
    int age;
    String color;

    public static void main(String[] args) {
        myMethod(); //This is a static method, can be called without an object

        //myPublicMethod();   //Will generate an error because it cannot be called from a static context - needs to be an object

        ClassMethods newObject = new ClassMethods();
        newObject.age = 34;
        newObject.color = "Red";

        newObject.myPublicMethod(newObject.age, newObject.color);   //Will work because it's being called by an object

        //PUBLIC MEANS OBJECT METHODS!

        ClassMethods newerObject = new ClassMethods();

        newerObject.myPublicMethod(50, "Blue");     //values can be passed in manually when calling the method

    }
    //STATIC METHODS VS NON-STATIC METHODS

    static void myMethod() {
        System.out.println("This is a STATIC method and can be called without creating objects!");
    }

    public void myPublicMethod(int x, String y) {
        System.out.println(x);
        System.out.println(y);
        System.out.println("This is a PUBLIC method and can be called without creating objects!");
    }
}
