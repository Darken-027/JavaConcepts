package others;

public class Literal {
    public static void main(String[] args) {
        // Literal
        byte variableByte = 12;
        short variableShort = 12;
        int variableInt = 12;
        long variableLong = 12l;

        // decimal literal
        float variableFloat = 12.2F;
        double variableDouble = 12.2;

        // Character and string literals
        String pais = "Espau00F1a";

        // Integer literal
        int value;
        value = 16;
        System.out.println("16 decimal = " + value);
        value = 020;
        System.out.println("20 octal = " + value + " en decimal");
        value = 0x10;
        System.out.println("10 hexadecimal = " + value + " en decimal");

        //Boolean Literal
        boolean valueTrue;
        valueTrue = true;

        System.out.println("El valor es: " + valueTrue);

        //Literal character
        char char2, char3;
        char2 = 67;
        char3 = 'C';
        System.out.println("La tercera letra del alfabeto = " + char2);
        System.out.println("La tercera letra del alfabeto = " + char3);

        //String literal type
        System.out.println("\n un texto de varias \n Lineas.");
    }
}
