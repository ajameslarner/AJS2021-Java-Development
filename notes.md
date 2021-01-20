# Language Notes

This document contains notes related to the developed of my Java understanding.

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

> **class** Noun {
>
>   *code...*
>
> }

---

### method

A function defined inside a class, classes will consist of multiple methods.
Defines a method of how to achieve a certain result.
There are built in methods and defined methods.

Examples

> **double(2)** = 4
> **add("ab","c")** = abc
> **print("hello")** = will print hello

To define a method has a similar concept to a class

1st define the method (verbs lowercase) - "drive"
2nd define the parameters (or arguements) its advised to keep these between 3-5 max - uppercase start "Speed"
3rd define the methods functionality (code in between {})

> **drive**(Speed) {
>
>   *code...*
>
> }

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
            code...
        }
        code...
    }
```