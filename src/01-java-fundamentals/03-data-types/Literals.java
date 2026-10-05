public class Literals {
    public static void main(String[] args) {

        int decimalNumber = 100;
        int binaryNumber = 0b1100100;
        int octalNumber = 0144;
        int hexadecimalNumber = 0x64;

        long largeNumber = 3_000_000_000L;
        float decimalFloat = 9.06f;
        double decimalDouble = 123.456789;
        char character = 'A';
        boolean isJavaEasyToLearn = true;
        String studentName = "Nagalakshmi";

        long population = 1_400_000_000L;
        int largeNumberWithUnderscores = 100_000_000;

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);
        System.out.println("Octal: " + octalNumber);
        System.out.println("Hexadecimal: " + hexadecimalNumber);

        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + decimalFloat);
        System.out.println("Double: " + decimalDouble);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + isJavaEasyToLearn);
        System.out.println("String: " + studentName);

        System.out.println("Population: " + population);
        System.out.println("Large Number: " + largeNumberWithUnderscores);
    }
}