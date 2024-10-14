package conditionals;

public class If_else {
    public static void main(String[] args) {

        int x = 18;
        int y = 7;
        int z = 9;

        if(z > y && x > z)
            System.out.println(x);
        else if(y > z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}
