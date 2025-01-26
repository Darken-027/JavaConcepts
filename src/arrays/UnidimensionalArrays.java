package arrays;

import java.util.Arrays;

public class UnidimensionalArrays {
    public static void main(String[] args) {
        // Declare an array of doubles
        double accountBalances[];
        accountBalances = new double[100];
        accountBalances[3] = 1340.0;
        System.out.println("Account 3 balance: $" + accountBalances[3]);

        // Another way
        double accountBalancesAlt[] = new double[1001];
        accountBalancesAlt[4] = 122.45;
        System.out.println("Account 4 balance: $" + accountBalancesAlt[3]);

        // Declaration and initialization of arrays

        // Declare an array of integers
        int[] integerArray;

        // Declare an array of strings
        String[] stringArray;

        int[] predefinedNumbers = { 10, 20, 30, 40, 50 };

        int[] defaultInitializedNumbers = new int[5]; // Create an array with 5 elements initialized to 0

        int[] partiallyInitializedNumbers = new int[3];
        partiallyInitializedNumbers[0] = 10; // Assign a value
        partiallyInitializedNumbers[1] = 20; // Assign another value

        // Access elements
        int[] accessedNumbers = { 10, 20, 30 };
        System.out.println(accessedNumbers[0]); // Print the first element: 10
        System.out.println(accessedNumbers[2]); // Print the third element: 30

        // Modify a value
        accessedNumbers[1] = 25;
        System.out.println(accessedNumbers[1]); // Now print: 25

        // Array size
        int[] sizedArray = { 10, 20, 30, 40 };
        System.out.println("The size of the array is: " + sizedArray.length);

        // Loop through an array
        int[] loopedArray = { 10, 20, 30, 40 };
        for (int i = 0; i < loopedArray.length; i++) {
            System.out.println("Element at index " + i + ": " + loopedArray[i]);
        }

        // Using a for-each loop
        int numberArray[] = { 10, 20, 30, 40, 50 };

        for (int num : numberArray) {
            System.out.println(num);
        }

        // Practical example: Adding the elements of an array
        int[] summationArray = { 5, 10, 15, 20 };
        int sum = 0;

        for (int num : summationArray) {
            sum += num; // Add each element
        }

        System.out.println("The sum of the elements is: " + sum);

        /*
         * // Arrays as method arguments
         * public static void printArray(int[] array) {
         * for (int num : array) {
         * System.out.print(num + " ");
         * }
         * System.out.println();
         * }
         * 
         * int[] numbersToPrint = {1, 2, 3, 4};
         * printArray(numbersToPrint); // Calls the method and passes the array
         */

        // Arrays as method return values
        /*
         * public static int[] generateArray(int size) {
         * int[] array = new int[size];
         * for (int i = 0; i < size; i++) {
         * array[i] = i + 1; // Fill the array with incremental values
         * }
         * return array;
         * }
         * 
         * int[] newArray = generateArray(5);
         * for (int num : newArray) {
         * System.out.print(num + " ");
         * }
         */

        // Useful classes for working with arrays
        /*
         * import java.util.Arrays;
         * 
         * int[] unsortedArray = {3, 1, 4, 1, 5};
         * Arrays.sort(unsortedArray); // Sort the array
         * System.out.println(Arrays.toString(unsortedArray)); // Prints: [1, 1, 3, 4,
         * 5]
         */

        // Search for an element (binary search):
        int[] sortedArray = { 1, 3, 5, 7 };
        int index = Arrays.binarySearch(sortedArray, 5); // Returns the index of element 5
        System.out.println("Index: " + index);

        // Copy an array
        int[] copiedArray = Arrays.copyOf(sortedArray, sortedArray.length);

        // Common errors when using arrays
        int[] errorArray = { 1, 2, 3 };
        // System.out.println(errorArray[3]); // Error: index 3 does not exist

        /*
         * Good practices:
         * Define the array size clearly and understandably.
         * Use for-each loops whenever index manipulation is unnecessary.
         * Handle indices carefully to avoid out-of-bounds errors.
         * Utilize the Arrays class for simplifying common operations like sorting or
         * copying.
         */
    }
}
