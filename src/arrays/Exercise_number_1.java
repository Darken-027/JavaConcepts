package arrays;

public class Exercise_number_1 {
    public static void main(String[] args) {
        // array containing the numbers from 1 to 100
        int numbers[] = new int[100];

        for(int i = 0; i < 100; i++){
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}
