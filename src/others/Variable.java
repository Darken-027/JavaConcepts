package others;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        // Variables
        /**
         * A placeholder for a value that behaves as the value
         * it contains
         * forexample
         * x = 123
         * y = "hello"
         * z = true
         *
         * DATA TYPES
         *
         * # boolean 1bit primitive true or false
         * byte 1byte primitive -128 to 127
         * short 2bytes primitive -32,768 to 32,767
         * # int 4bytes primitive -2 billion to 2 billion
         * long 8bytes primitive -9 quintillon to 9 quintillon
         *
         *
         * float 4bytes primitive fractional number up to 6-7 digits ex. 3.141592
         * # double 8bytes primitive fractional number up to 15 digits ex.
         * 3.141592653589793
         *
         * # char 2bytes primitive single character/latter/ASCII value ex. 'f'
         * # String varies referente a sequence of characters ex. "Hello World"
         *
         *
         * How to create a variable
         *
         * int x; declaraction
         * x = 123; assignment
         * int x = 123; initialization
         * long x = 122444343555342424;
         *
         *
         *
         * When we need to store a larger number, we use the long data type, and we do
         * the conversion with the capital letter L,
         * placed after the number, for example, long x = 122444343555342424L;
         *
         *
         * input in java
         *
         * impor java.itul.Scanner;
         * Scanner scanner = new Scanner(System.in);
         *
         **/

        // String name = "";
        // int age = 0;
        //
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("what is your name: ");
        // name = scanner.nextLine();
        // System.out.print("how old are you ? ");
        // age = scanner.nextInt();
        //
        //
        //
        // System.out.println("hello " + name);
        // System.out.print("Your age is.. " + age + " year old");

        // Expression
        double friends = 10;

        friends--;

        System.out.println(friends);

        // Iteger type variables
        byte bytel;
        short shortl;
        int intl;
        long longl;
        bytel = 1;
        shortl = 100;
        intl = 10000;
        longl = 100000000;
        System.out.println("byte1 = " + bytel);
        System.out.println("shortl = " + shortl);
        System.out.println("int = " + intl);
        System.out.println("ongl = " + longl);

        // floating point variables
        float floatl;
        double doublel;
        floatl = 1.11111111111F;
        doublel = 1.1111111111111E+9D;
        System.out.println("f1oatl = " + floatl);
        System.out.println("doub1el = " + doublel);

        // Boolean type variables
        boolean booleanl, boolean2;
        booleanl = true;
        boolean2 = false;
        System.out.println("boo1eanl = " + booleanl);
        System.out.println("boolean2 = " + booleanl);

        // Determine flow

        boolean boolean3, boolean4;
        boolean3 = true;
        boolean4 = false;

        if (boolean3) {
            System.out.println("boolean3 is true");
        } else {
            System.out.println("Boolean3 is false");
        }

        // Inicialize variables
        int number1;
        number1 = 12;
        System.out.println("number1 = " + number1);

        int number3 = 44;
        System.out.println("number3 = " + number3);

        // Or other form
        int int11 = 1, int12 = 2, int13 = 3, int14 = 4;

        System.out.println("int11 = " + int11 + " int12 = " + int12 + " int13 = " + int13 + " int14 = " + int14);

        // dinami initialization
        int int55 = 2, int33 = 3;
        int int77 = int55 * int33;
        System.out.println("int55 = " + int55 + ", int33 = " + int33 +
                ", int77 = " + int77);

        int intA = 2, intB = 3;
        System.out.println("intA = " + intA + ", intB = " + intB);
        int intC = intA * intB;
        System.out.println(intC = -+ intC);
    }
}
