import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public final static String SPLIT_STRING = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String input = scanner.nextLine().trim();
        String[] words = input.split(SPLIT_STRING);
        new Reverse().printReverseWords(words);
    }
}

class Reverse {
    public void printReverseWords(String[] words) {
        for (String word : words) {
            String reversedWord = reverse(word);
            System.out.print(reversedWord + " ");
        }
    }

    private String reverse(String word) {
        char[] copyWord = word.toCharArray();
        String toString = "";
        StringBuilder reversedWord = new StringBuilder(toString);
        for (int i = word.length() - 1; i > -1; i--) {
            if (Character.isLetter(copyWord[i])) {
                reversedWord.append(copyWord[i]);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isLetter(copyWord[i]))) {
                reversedWord.insert(i, copyWord[i]);
            }
        }
        toString = reversedWord.toString();
        return toString;

    }

}