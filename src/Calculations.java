import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter another number:");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println(operationToString(number1, number2, number1 + number2, "+"));
        System.out.println(operationToString(number1, number2, number1 - number2, "-"));
        System.out.println(operationToString(number1, number2, number1 * number2, "*"));
        System.out.println(operationToString(number1, number2, number1 / number2, "/"));
        System.out.println(operationToString(number1, number2, number1 % number2, "%"));

    }

    private static String doubleToString(double value) {
        return (value == (int) value) ? Integer.toString((int) value) : Double.toString(value);
    }

    private static String operationToString(double value1, double value2, double result, String opSymbol) {
        return doubleToString(value1) + " " + opSymbol + " " + doubleToString(value2) + " = " + doubleToString(result);
    }
}