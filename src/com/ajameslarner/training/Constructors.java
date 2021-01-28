package com.ajameslarner.training;

public class Constructors {

    //Initialising object variables/attributes
    int age;
    int price;
    String name;
    String color;

    public Constructors() {             //The constructor is called when the object is created! it initializes the objects attributes
        age = 10;
        price = 400;
        name = "car";
        color = "Black";
    }

    public static void main(String[] args) {

        Constructors consObjects = new Constructors();
        System.out.println(consObjects.age);

        //That's enough for today, im drunk...
    }
}
