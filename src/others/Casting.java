package others;

public class Casting {
    public static void main(String[] args) {
        // auto conversion
        byte byteU = 1;
        int intU;
        intU = byteU;
        System.out.println("int1 = " + intU);

        // Casting
        byte byteS;
        int intS = 1;
        byteS = (byte) intS;
        System.out.println("byteS = " + byteS);

        // Java Type Casting

        /*
         * ype casting is when you assign a value of one primitive data type to another
         * type.
         * 
         * In Java, there are two types of casting:
         * 
         * Widening Casting (automatically) - converting a smaller type to a larger type
         * size
         * byte -> short -> char -> int -> long -> float -> double
         * 
         * Narrowing Casting (manually) - converting a larger type to a smaller size
         * type
         * double -> float -> long -> int -> char -> short -> byte
         */

        // Widening Casting
        // Widening casting is done automatically when passing a smaller size type to a
        // larger size type:

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        // Narrowing Casting
        // Narrowing casting must be done manually by placing the type in parentheses ()
        // in front of the value
        double miDouble = 9.78d;
        int miInt = (int) miDouble; // Manual casting: double to int

        System.out.println(miDouble); // Outputs 9.78
        System.out.println(miInt); // Outputs 9

        // Real-Life Example
        /*
         * Here's a real-life example of type casting where we create a program to
         * calculate the percentage of a user's score in relation to the maximum score
         * in a game.
         * 
         * We use type casting to make sure that the result is a floating-point value,
         * rather than an integer:
         */
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /*
         * Calculate the percantage of the user's score in relation to the maximum
         * available score.
         * Convert userScore to float to make sure that the division is accurate
         */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
        System.out.println("User's percentage is " + percentage);
        System.out.println("User's percentage is " + percentage);
    }
}
