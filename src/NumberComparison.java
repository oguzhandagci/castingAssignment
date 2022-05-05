import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number1 == number2) {
            System.out.println("Numbers were equal");
        } else if (number1 > number2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}
