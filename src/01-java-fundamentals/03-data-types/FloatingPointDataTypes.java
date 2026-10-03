public class FloatingPointDataTypes {
    public static void main(String[] args) {

        float temperature = 32.5f;
        double studentCGPA = 9.06;
        float productPrice = 499.99f;
        double percentage = 92.75;

        System.out.println("Temperature: " + temperature);
        System.out.println("Student CGPA: " + studentCGPA);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Percentage: " + percentage);

        // Float requires F suffix
        float floatValue = 123.456789f;

        // Double does not require D suffix
        double doubleValue = 123.456789123456;

        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
    }
}