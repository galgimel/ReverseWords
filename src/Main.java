import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 слова: "); // делаем красивую обертку
        String input = scanner.nextLine().trim();// создаем и инициализируем масив "каркас" на 2 элемента, который будем переворачивать
        String[] words = new String[2];
        try{
            words = input.split(" ");
        } catch (Exception e){
            System.out.println("Ошибка! Вы набрали больше 2х слов!"); // ошибка на случай ввода больше 2х слов
        }
        printReverseWords(words);

    }

    public static void printReverseWords(String[] words) { // метод, который будет переворачивать элементы в массиве, который был принят на вход и выводить их на консоль
        for (int i = 0; i < words.length; i++) {
        System.out.print(reverse(words[i]) + " ");
        }
    }
    public static String reverse(String word){
        char[] arrayToReverse = word.toCharArray();
        char[] reversedArray = new char[word.length()];
        String reversedWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
                reversedArray[arrayToReverse.length - i - 1] = arrayToReverse[i];
                reversedWord += reversedArray[arrayToReverse.length - i - 1];
        }

        return reversedWord;
    }
}