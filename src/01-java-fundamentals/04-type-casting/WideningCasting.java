public class WideningCasting {
    public static void main(String[] args) {
        // byte to short conversion
        byte byteValue = 100;
        short shortValue = byteValue;
        System.out.println("Original Byte Value: " + byteValue);
        System.out.println("After byte to short conversion: " + shortValue);

        // short to int conversion
        short originalShortValue = 30000;
        int intValue = originalShortValue;
        System.out.println("Original Short Value: " + originalShortValue);
        System.out.println("After short to int conversion: " + intValue);

        // int to long conversion
        int population = 10000000;
        long longValue = population;
        System.out.println("Original int Value: " + population);
        System.out.println("After int to long conversion: " + longValue);

        // int to double conversion
        int marks = 95;
        double doubleMarks = marks;
        System.out.println("Original int Marks: " + marks);
        System.out.println("After int to double conversion: " + doubleMarks);

        // float to double conversion
        float floatValue = 123.678f;
        double convertedDoubleValue = floatValue;
        System.out.println("Original float Value: " + floatValue);
        System.out.println("After float to double conversion: " + convertedDoubleValue);

        // char to int conversion
        char ch = 'A';
        int numericValue = ch;
        System.out.println("Original Character Value: " + ch);
        System.out.println("After char to int conversion: " + numericValue);
    }
}