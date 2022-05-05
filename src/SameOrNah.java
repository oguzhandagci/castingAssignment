import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1 = scanner.nextLine();
        System.out.println("Enter another word:");
        String word2 = scanner.nextLine();

        System.out.println((word1.equals(word2)) ? "The words are the same" : "The words are different");
    }
}
