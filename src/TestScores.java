import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade > 100 || grade < 0) {
            System.out.println("Enter a valid value");
        } else if (grade <= 100 && grade > 89) {
            System.out.println("Your grade is an A :)");
        } else if (grade <= 89 && grade > 79) {
            System.out.println("Your grade is a B");
        } else if (grade <= 79 && grade > 69) {
            System.out.println("Your grade is a C");
        } else if (grade <= 69 && grade > 59) {
            System.out.println("Your grade is a D");
        } else if (grade <= 59 && grade >= 0) {
            System.out.println("Your grade is an F :(");
        } else {
            System.out.println("Enter a valid value");
        }
    }
}
