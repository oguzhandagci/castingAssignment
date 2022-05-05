import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println((number1 > 212) ? "Water is boiling" : "Water isn't boiling");
    }
}
