import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] words = input.split(" ");
        printReverseWords(words);
    }

    public static void printReverseWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
        System.out.print(reverse(words[i]) + " ");
        }
    }
    public static String reverse(String word){
        char[] arrayToReverse = word.toCharArray();
        ArrayList<Character> reversedArray = new ArrayList<>(word.length());
        String reversedWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            if (Character.isLetter(arrayToReverse[i])){
                reversedArray.add(arrayToReverse[i]);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isLetter(arrayToReverse[i]))){
                reversedArray.add(i, arrayToReverse[i]);
            }
            reversedWord += reversedArray.get(i);
        }
        return reversedWord;
    }
}