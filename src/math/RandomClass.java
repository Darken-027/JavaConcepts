package math;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6)+1;
        double y = random.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(y);
    }
}
