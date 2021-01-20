# Language Notes

This document contains notes related to the developed of my Java understanding.
Java is an **Object Oriented Language**

## Basic Keywords & Concepts

### package

A file structure of your program (a package declaration)

Examples

> **package** com.web.address.program

---

### import

import a specific file into the program (static imports included)

Examples

> **import** **static** com.web.address.program.init

---

### class

A way to structure your code and classify code blocks, classes can be defined by the programmer. 
The definition should be a noun, starting with a capital letter.
A class should consist of multiple methods (functions within a class)

Examples

```
class Noun {
  code...
}
```

---

### method

A function defined inside a class, classes will consist of multiple methods.
Defines a method of how to achieve a certain result.
There are built in methods and defined methods.

Examples

```
double(2) = 4
add("ab","c") = abc
print("hello") = will print hello
```

To define a method has a similar concept to a class

1st define the method (verbs lowercase) - "drive"
2nd define the parameters (or arguements) its advised to keep these between 3-5 max - uppercase start "Speed"
3rd define the methods functionality (code in between {})

```
drive(Speed) {
  code...
}
```

---

### variable

A variable value or placeholder to store values/data. These can be defined by the programmer and can store a variation of data types.
camelCase is advised for variable names. (exampleVariable)

There are different types of variables that can be defined. 

Examples

**instance** variables
**static** variables
**local** variables
**parameter**
**arguement**

More info later...

---

### public

More info later...

Examples

```
public class Noun {
        drive(Speed) {

        }
    }
```

---

### void

For every method you have to define a return value, even when you dont want to return a value, this is void return type

Here is an example of a method within a class that is not return any value simple performing the action request i.e. making the car drive.

Drive is a **command** method, therefore does not return any value. Where as a method that adds two numbers together will return the result.

```
public class Car {
    public void drive(Drive) {

    }
}
```

---

### @ 

This symbol is an annotate symbol

Excamples

```
@This is an annotation within a code block
```

---

### camelCase

Already known.

---

### . (dot)

The dot can be used to indicate performing or executing a method on a particular variable.

Examples

```
car.drive()
```

---

### ; (colon)

This indicates the end of a Java statement.

Examples

```
@Example method testing the car driving
public void shouldDrive() {
    car.drive(100);
}
```

Notice the use of camelCase, dots & colons.

---