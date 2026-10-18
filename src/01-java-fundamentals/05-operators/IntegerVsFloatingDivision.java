public class IntegerVsFloatingDivision {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        // Integer division
        int intResult = a / b;
        System.out.println("Integer division: " + intResult);

        // Floating-point division using float
        float c = a;
        float floatResult = c / b;
        System.out.println("Float division: " + floatResult);

        // Division after explicit casting to double
        double result = (double) a / b;
        System.out.println("Division after casting: " + result);
    }


}
