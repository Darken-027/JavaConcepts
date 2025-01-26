package arrays;

import java.util.Scanner;

public class ArraysExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lastname = new String [5];
        lastname[0] = "Labrada";
        lastname[1] = "Arteaga"; 
        lastname[2] = "Perez"; 
        lastname[3] = "Ahstell";  

        for(int i=0; i<lastname.length; i++){
            System.out.println(lastname[i]); 
        }

        // prices
        int [] prices =  new int [5];
        
        for(int i=0; i<prices.length; i++){
            System.out.print("Give me your prices: " );
            prices[i] = sc.nextInt();
        }
        // print prices
        for(int i=0; i<prices.length; i++){
            System.out.println(prices[i]); 
        }
    } 

}
