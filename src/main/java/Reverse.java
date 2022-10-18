public class Reverse {
    public void printReverseWords(String[] words) {
        for (String word : words) {
            String reversedWord = reverse(word);
            System.out.print(reversedWord + " ");
        }
    }

    public String reverse(String word) {
        char[] copyWord = word.toCharArray();
        String toString = Constants.EMPTY_STRING;
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
