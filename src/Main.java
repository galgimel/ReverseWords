
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String input = scanner.nextLine().trim();
        String[] words = input.split(CONSTANTS.SPLIT_STRING);
        new Reverse().printReverseWords(words);
    }

}