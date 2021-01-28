package com.ajameslarner.training;

public class Constructors {

    //Initialising object variables/attributes
    int age;
    int price;
    String name;
    String color;

    public Constructors(int x, int y, String z, String p) {
        //the constructor can be given parameters to assign the attributes by passing them into the new object
        age = x;
        price = y;
        name = z;
        color = p;
    }

    public static void main(String[] args) {

        Constructors consObjects = new Constructors(45,23,"John","Red");     //The attributes are being set by passing values into the constructor

        System.out.println(consObjects.age);
        System.out.println(consObjects.price);
        System.out.println(consObjects.name);
        System.out.println(consObjects.color);

    }
}
