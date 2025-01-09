package math;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side X: ");
        x = scanner.nextDouble();
        System.out.print("Enter side Y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The Hypotenuse is: " + z);
    }
}
