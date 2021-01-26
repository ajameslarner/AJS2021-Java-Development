package com.ajameslarner.training;

public class Objects {
    String color;
    int weight;
    final int price = 500;          //The FINAL keyword - This can be used to stop objects modifying the value - THIS IS A FINAL VALUE

    public static void main (String[] args) {

        //Objects can be created from the class on this file like so
        //I will use the car example for this demonstration
        Objects mercedes = new Objects();
        mercedes.color = "Black";       //The attributes have been assigned here but they can also be defined in the class itself
        mercedes.weight = 340;

        System.out.println("Car Color: " + mercedes.color);
        System.out.println("Car Weight: " + mercedes.weight);

        //Example of multiple objects (cars)
        //Objects
        Objects porche = new Objects();
        Objects mustang = new Objects();

        //Attributes
        porche.color = "Red";
        porche.weight = 200;
        mustang.color = "Blue";
        mustang.weight = 560;
        //mustang.price = 5000;   //WILL GENERATE AN ERROR BEFORE OF THE FINAL KEYWORD! - Cannot be reassigned

        //Output
        System.out.println("Car Color: " + porche.color);
        System.out.println("Car Weight: " + porche.weight);
        System.out.println("Car Color: " + mustang.color);
        System.out.println("Car Weight: " + mustang.weight);

        //Object from another class (file) - Variables.java
        Variables externalObject = new Variables();

        externalObject.age = 6;
        externalObject.color = "Red";
        externalObject.initial = 'A';

        System.out.println(externalObject.age);
        System.out.println(externalObject.color);
        System.out.println(externalObject.initial);
    }
}
