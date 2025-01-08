package others;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        //Variables
        /**
         * A placeholder for a value that behaves as the value
         * it contains
         *      forexample
         *      x = 123
         *      y = "hello"
         *      z = true
         *
         *      DATA TYPES
         *
         *    # boolean 1bit    primitive   true or false
         *      byte    1byte   primitive   -128 to 127
         *      short   2bytes  primitive   -32,768 to 32,767
         *   #  int     4bytes  primitive   -2 billion to 2 billion
         *      long    8bytes  primitive   -9 quintillon to 9 quintillon
         *
         *
         *      float   4bytes primitive    fractional number up to 6-7 digits ex. 3.141592
         *   #  double  8bytes primitive    fractional number up to 15 digits ex. 3.141592653589793
         *
         *   #  char    2bytes primitive    single character/latter/ASCII value ex. 'f'
         *   #  String  varies referente    a sequence of characters ex. "Hello World"
         *
         *
         *      How to create a variable
         *
         *          int x;  declaraction
         *          x = 123;    assignment
         *          int x = 123;    initialization
         *          long x = 122444343555342424;
         *
         *
         *
         *          When we need to store a larger number, we use the long data type, and we do the conversion with the capital letter L,
         *          placed after the number, for example, long x = 122444343555342424L;
         *
         *
         *          input in java
         *
         *          impor java.itul.Scanner;
         *          Scanner scanner = new Scanner(System.in);
         *
         **/

//        String name = "";
//        int age = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("what is your name: ");
//        name = scanner.nextLine();
//        System.out.print("how old are you ? ");
//        age = scanner.nextInt();
//
//
//
//        System.out.println("hello " + name);
//        System.out.print("Your age is.. " + age + " year old");


        //Expression
        double friends = 10;

        friends--;

        System.out.println(friends);
    }
}
