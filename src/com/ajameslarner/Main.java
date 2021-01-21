package com.ajameslarner;

public class Main {
    public static void main(String[] args) {

        //byte stores 1 byte of digits (127 +/-)
        byte a = 1;
        System.out.println(a);
        //short stores 2 bytes of digits (32,767 +/-)
        short b = 32000;
        System.out.println(b);
        //int stores 4 bytes of digits (2,147,483,648 +/-)
        int c = 2000000000;
        System.out.println(c);
        //long stores 8 bytes of digits (9,223,372,036,854,775,808 +/-) - weird error not allowing full amount
        long d = 92288888;
        System.out.println(d);
        //float stores 4 bytes of digits (2,147,483,648 +/-) while allowing fractional numbers up to 6-7 decimal places
        double e = 2;
        System.out.println(e);

    }
}
