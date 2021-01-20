# Theoretical Java Programming Understanding

Object Oriented Language

Everything is focused around objects

Java needs a programmer to fully understand a problem to extract a theoretical model to be transferred into a class model.

The more accurate this is done, the less code has to be written, the easier it can be to maintain and the less error you will come across.

```
class Car(age, maxSpeed)

objects

myOldCar (10 years old, max speed 120)
myPorche (5 years old, max speed 150)
myFerrari (2 years old, max speed 200)

```

Objects will be created from the classes, these are created using a method called **constructor** and will create an object when called upon.
However will not create an object is the object already exists.

to create a new object within a class you would do the following:

```
public void class Car(age, maxSpeed) {
    new Car(10,120);
}
```

Two numbers are given, one for the "age" and another for the "maxSpeed".
To store the object created into a variable we need to allocated it. This can be done like so:

```
public void class Car(age, maxSpeed) {
    Car myPorche = new Car(10,120);
}
```