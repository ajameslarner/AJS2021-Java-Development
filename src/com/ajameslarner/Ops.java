package com.ajameslarner;

public class Ops {
    public static void main(String[] args) {
        //Arithmetic Operators
        int add = 5 + 10;   //stores 15
        int sub = 10 - 5;   //stores 5
        int mul = 5 * 2;    //stores 10
        int div = 10 / 2;   //stores 5
        int mod = 75 % 60;  //stores 15 - Modulus arithmetic calculates the division remainder from the allocation mod (60)
        int inc = 10;
        ++inc;              //Increments the value of the variable by 1 (outputs 11)
        int dec = 10;
        --dec;              //Decrements the value of the variable by 1 (outputs 9)

        System.out.println("Arithmetic Operators: ");
        System.out.println(add + sub - mul * div / mod % inc);

        //Assignment Operators & augmented assignments
        int x = 10;     //= sets the value
        x += 5;         //adds a value to the value in the variable (output 15)
        x -= 5;         //subtracts a value to the value in the variable (output 5)
        x *= 5;         //multiplies a value to the value in the variable (output 50)
        x /= 2;         //divides a value to the value in the variable (output 5)
        x %= 5;         //modulus arithmetic - returns the remainder when divided by the mod

        x &= 28;        //AND Bitwise Operator, compares the two binary values and returns on AND logic (output 8)
        x |= 28;        //OR Bitwise Operator, compares the two binary values and returns on OR logic (output 30)
        x ^= 28;        //XOR Bitwise Operator, compares the two binary values and returns on EXCLUSIVE OR logic (output 22)
        //More details below

        x >>= 2;        //RightShift Right Shift Bit Operator
        x <<= 2;        //Left Shift Bit Operator
        // More details below

        //Bitwise Operators -  1 2 4 8 16 32 64 128
        int z = 10;         //0000 1010
        int v = 28;         //0001 1100

        //0000 1000 - AND (8 dec)
        //0001 1110 - OR (30 dec)
        //0001 0110 - XOR (22 dec)
        //0000 0010 - RightShift (2 dec)
        //0010 1000 - LeftShift (40 dec)

        int and = z&v;      //AND Bit Operator
        int or = z|v;       //OR Bit Operator
        int xor = z^v;      //XOR Bit Operator

        System.out.println("This is AND: " + and);  //outputs 8
        System.out.println("This is OR: " + or);    //outputs 30
        System.out.println("This is XOR: " + xor);  //outputs 22

        int rightShift = z >> 2;     //Right Shift Bit Operator - Shifts all the bits right by the stated amount (2)
        int leftShift = z << 2;      //Left Shift Bit Operator - Shifts all the bits left by the stated amount (2)

        System.out.println("This is RightShift: " + rightShift);  //outputs 2
        System.out.println("This is LeftShift: " + leftShift);    // outputs 40

        //Comparison Operators
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;

        if (a == b) {
            System.out.println("a & b are equal");
        }
        if (a != b) {
            System.out.println("a & b are not equal");
        }
        if (a > b) {
            System.out.println("a is greater than b");
        }
        if (a < b) {
            System.out.println("b is greater than a");
        }
        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        }
        if (a <= b) {
            System.out.println("b is greater than or equal to a");
        }

        //Logical Operators
        if (a == b && c == d) {
            System.out.println("a & b ARE equal, AND c & d ARE also equal");
        } else if (!(a == b && c == d)) {
            System.out.println("a & b are NOT equal, AND c & d are also NOT equal");
        }
        if (a == b || c == d) {
            System.out.println("a & b ARE equal, OR c & d ARE also equal");
        } else if (!(a == b || c == d)) {
            System.out.println("a & b are NOT equal, OR c & d are also NOT equal");
        }
    }
}
