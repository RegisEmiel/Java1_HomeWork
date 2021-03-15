package HomeWork_3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    private static final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    private static final int MATCHING_POSITIONS_MASK_LENGTH = 15;
    private static final char SECRET_SYMBOL = '*';

    private static String getSecretWord() {
        int wordCount = WORDS.length;

        Random random = new Random();

        int secretWordIndex = random.nextInt(wordCount);

        return WORDS[secretWordIndex];
    }

    private static String getMatchingPositionsMask(String secretWord, String answerWord) {
        int length = Math.min(secretWord.length(), answerWord.length());

        StringBuilder matchingPositionMask = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = secretWord.charAt(i) == answerWord.charAt(i) ? secretWord.charAt(i) : SECRET_SYMBOL;
            matchingPositionMask.append(ch);
        }

        for (int i = length; i < MATCHING_POSITIONS_MASK_LENGTH; i++)
            matchingPositionMask.append(SECRET_SYMBOL);

        return matchingPositionMask.toString();
    }

    private static void play() {
        Scanner scanner = new Scanner(System.in);

        String secretWord = getSecretWord();
        String answerWord;

        int attempt = 0;
        boolean fWin = false;

        do {
            System.out.print("Предложите слово или введите exit для выхода: ");
            answerWord = scanner.nextLine();

            attempt++;

            if ("exit".equals(answerWord))
                break;

            if (!secretWord.equals(answerWord)) {
                String matchingString = getMatchingPositionsMask(secretWord, answerWord);
                System.out.print("Слово не угадано! Совпадающие части слов: ");
                System.out.println(matchingString);
                System.out.println();
            } else
                fWin = true;
        } while (!secretWord.equals(answerWord));

        if (fWin)
            System.out.printf("\nПобеда!\nЗагаданное слово: %s. Количество попыток: %d\n", secretWord, attempt);
        else
            System.out.printf("\nПроигрыш! Вы сдались.\nЗагаданное слово: %s. Количество попыток: %d\n", secretWord, attempt);
    }

    public static void main(String[] args) {
        play();
    }
}
