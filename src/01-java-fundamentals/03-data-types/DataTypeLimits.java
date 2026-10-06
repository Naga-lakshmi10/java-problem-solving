public class DataTypeLimits {
    public static void main(String[] args) {

        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float Range: " + (-Float.MAX_VALUE) + " to " + Float.MAX_VALUE);
        System.out.println("Double Range: " + (-Double.MAX_VALUE) + " to " + Double.MAX_VALUE);
        System.out.println("Character Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
    }
}