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
types of variables

```
byte 	    1 byte 	    Stores whole numbers from -128 to 127
short 	    2 bytes 	Stores whole numbers from -32,768 to 32,767
int 	    4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 	    8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float 	    4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double 	    8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean     1 bit 	    Stores true or false values
char 	    2 bytes 	Stores a single character/letter or ASCII values
```

primitives


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

Drive is a **command** method, therefore does not return any value. Whereas a method that adds two numbers together will return the result.

```
public class Car {
    public void drive(Drive) {

    }
}
```

---

### @test


```
NEED WORK
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

### Arithmetic Operators

These can be used to perform common arithmetic operations.

Examples

```
+ 	Addition            Adds together two values                    x + y 	
- 	Subtraction 	    Subtracts one value from another            x - y 	
* 	Multiplication      Multiplies two values                       x * y 	
/ 	Division            Divides one value by another                x / y 	
% 	Modulus             Returns the division remainder              x % y 	
++ 	Increment           Increases the value of a variable by 1      ++x 	
-- 	Decrement           Decreases the value of a variable by 1      --x
```

---

### Assignment Operators

Assignment operators are used to assign values to variables

Examples

```
=       x = 5       x = 5 	
+=      x += 3      x = x + 3 	
-=      x -= 3      x = x - 3 	
*=      x *= 3      x = x * 3 	
/=      x /= 3      x = x / 3 	
%=      x %= 3      x = x % 3 	
&=      x &= 3      x = x & 3 	
|=      x |= 3      x = x | 3 	
^=      x ^= 3      x = x ^ 3 	
>>=     x >>= 3     x = x >> 3 	
<<=     x <<= 3     x = x << 3
```