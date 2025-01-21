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

        
    }
}
