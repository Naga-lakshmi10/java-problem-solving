public class NarrowingCasting {
    public static void main(String[] args) {

        // double to int conversion
        double price = 499.98;
        int convertedPrice = (int) price;
        System.out.println("Original double value: " + price);
        System.out.println("Converted int value: " + convertedPrice);


        // float to int conversion
        float value = 98.5678f;
        int integerValue = (int) value;
        System.out.println("Original float value: " + value);
        System.out.println("Converted int value: " + integerValue);


        // negative float to int conversion
        float number = -976.346f;
        int convertedNumber = (int) number;
        System.out.println("Original float value: " + number);
        System.out.println("Converted int value: " + convertedNumber);


        // long to int conversion
        long longValue = 100000000L;
        int convertedIntValue = (int) longValue;
        System.out.println("Original long value: " + longValue);
        System.out.println("Converted int value: " + convertedIntValue);


        // long to int conversion with overflow
        long largeLongValue = 232474836495L;
        int overflowIntValue = (int) largeLongValue;
        System.out.println("Original long value: " + largeLongValue);
        System.out.println("Converted int value: " + overflowIntValue);


        // int to short conversion
        int intValue = 30000;
        short convertedShortValue = (short) intValue;
        System.out.println("Original int value: " + intValue);
        System.out.println("Converted short value: " + convertedShortValue);


        // int to short conversion with overflow
        int largeIntValue = 33767;
        short overflowShortValue = (short) largeIntValue;
        System.out.println("Original int value: " + largeIntValue);
        System.out.println("Converted short value: " + overflowShortValue);


        // int to byte conversion
        int smallIntValue = 100;
        byte convertedByteValue = (byte) smallIntValue;
        System.out.println("Original int value: " + smallIntValue);
        System.out.println("Converted byte value: " + convertedByteValue);


        // int to byte conversion with overflow
        int byteOverflowValue = 129;
        byte convertedOverflowByte = (byte) byteOverflowValue;
        System.out.println("Original int value: " + byteOverflowValue);
        System.out.println("Converted byte value: " + convertedOverflowByte);


        // int to char conversion
        int asciiValue = 65;
        char convertedCharacter = (char) asciiValue;
        System.out.println("Original int value: " + asciiValue);
        System.out.println("Converted char value: " + convertedCharacter);


        // another int to char conversion
        int digitValue = 49;
        char convertedDigit = (char) digitValue;
        System.out.println("Original int value: " + digitValue);
        System.out.println("Converted char value: " + convertedDigit);


        // integer division
        int obtainedMarks = 455;
        int totalMarks = 500;
        double integerDivisionResult = obtainedMarks / totalMarks;
        double accurateDivisionResult = (double) obtainedMarks / totalMarks;
        System.out.println("Integer Division Result: " + integerDivisionResult);
        System.out.println("Accurate Division Result: " + accurateDivisionResult);


        // average using integer division and type casting
        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 94;
        int integerAverage = (mark1 + mark2 + mark3) / 3;
        double accurateAverage = (double) (mark1 + mark2 + mark3) / 3;
        System.out.println("Integer Average: " + integerAverage);
        System.out.println("Accurate Average: " + accurateAverage);
    }
}