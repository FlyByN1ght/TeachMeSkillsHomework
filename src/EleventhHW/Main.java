package EleventhHW;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Даниил
 * version 1.0
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String strOne = scanner.nextLine();
        String strTwo = scanner.nextLine();
        String strThree = scanner.nextLine();

        String[] array = new String[3];
        array[0] = strOne;
        array[1] = strTwo;
        array[2] = strThree;

        taskOne(strOne, strTwo, strThree);
        taskOne(array);
        increase(strOne, strTwo, strThree);
        average(strOne, strTwo, strThree);
        differentSymbols(array);
        System.out.println("Words to double characters: ");
        doubleCharacters(scanner.nextLine());
        System.out.println("Enter the string: ");
        palindrome(scanner.nextLine());
    }

    /**
     * Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
     * найденные строки и их длину
     * version 1.0
     */
    static void taskOne(String[] strings) {
        String min = strings[0];
        String max = strings[0];

        for (String str : strings) {
            if (str.length() < min.length()) {
                min = str;
            }

            if (str.length() > max.length()) {
                max = str;
            }
        }
        System.out.println("Short line: " + min + ", number of characters = " + min.length());
        System.out.println("Biggest line: " + max + ", number of characters = " + max.length());
    }

    /**
     * Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
     * найденные строки и их длину
     * version 2.0
     */
    static void taskOne(String strOne, String strTwo, String strThree) {
        int max, min;

        if (strOne.length() == strTwo.length() && strThree.length() == strOne.length()) {
            System.out.println("All lines the same");
            return;
        }

        if (((strOne.length() > strTwo.length()) && (strOne.length() > strThree.length()))) {
            max = strOne.length();
            System.out.println("Short line: " + strOne + ", number of characters = " + max);
            if (strTwo.length() < strThree.length()) {
                min = strTwo.length();
                System.out.println("Short line: " + strTwo + ", number of characters = " + strTwo.length());
            } else {
                min = strThree.length();
                System.out.println("Short line: " + strThree + ", number of characters = " + min);
            }
        } else if ((strTwo.length() > strOne.length()) && (strTwo.length() > strThree.length())) {
            max = strTwo.length();
            System.out.println("Biggest line: " + strTwo + ", number of characters = " + max);
            if (strOne.length() < strThree.length()) {
                min = strOne.length();
                System.out.println("Short line: " + strOne + ", number of characters = " + min);
            } else {
                min = strThree.length();
                System.out.println("Short line: " + strThree + ", number of characters = " + min);
            }
        } else if ((strThree.length() > strTwo.length()) && (strThree.length() > strOne.length())) {
            max = strThree.length();
            System.out.println("Biggest line: " + strThree + ", long string = " + max);
            if (strOne.length() < strTwo.length()) {
                min = strOne.length();
                System.out.println("Short line: " + strOne + ", long string  = " + min);
            } else {
                min = strTwo.length();
                System.out.println("Short line: " + strTwo + ", long string = " + min);
            }
        }
    }

    /**
     * Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
     * значений их длины
     */
    static void increase(String strOne, String strTwo, String strThree) {
        System.out.println("Increase string: ");
        if ((strOne.length() < strTwo.length()) && (strOne.length() < strThree.length())) {
            System.out.println(strOne);
            if (strTwo.length() < strThree.length()) {
                System.out.println(strTwo);
                System.out.println(strThree);
            } else {
                System.out.println(strThree);
                System.out.println(strTwo);
            }
        } else if ((strTwo.length() < strOne.length()) && (strTwo.length() < strThree.length())) {
            System.out.println(strTwo);
            if (strOne.length() < strThree.length()) {
                System.out.println(strOne);
                System.out.println(strThree);
            } else {
                System.out.println(strThree);
                System.out.println(strOne);
            }
        } else if ((strThree.length() < strTwo.length()) && (strThree.length() < strOne.length())) {
            System.out.println(strThree);
            if (strOne.length() < strTwo.length()) {
                System.out.println(strOne);
                System.out.println(strTwo);
            } else {
                System.out.println(strTwo);
                System.out.println(strOne);
            }
        } else {
            System.out.println(strOne);
            System.out.println(strTwo);
            System.out.println(strThree);
        }
    }

    /**
     * Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
     * средней, а также их длину.
     */
    static void average(String strOne, String strTwo, String strThree) {
        int averageValue = (strOne.length() + strTwo.length() + strThree.length()) / 3;

        if (strOne.length() == strTwo.length() && strTwo.length() == strThree.length()) {
            System.out.println("All string the same");
            return;
        }

        if (strOne.length() < averageValue) {
            System.out.println("Length is less than the average length of the line: " + strOne +
                    " long string = " + strOne.length());
        }

        if (strTwo.length() < averageValue) {
            System.out.println("Length is less than the average length of the line: " + strTwo +
                    " long string = " + strTwo.length());
        }

        if (strThree.length() < averageValue) {
            System.out.println("Length is less than the average length of the line:" + strThree +
                    " long string = " + strThree.length());
        }
    }

    /**
     * Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
     * Если таких слов несколько, найти первое из них.
     */
    public static boolean hasUniqueChars(String word) {
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (Character ch : word.toCharArray()) {
            if (!uniqueChars.add(Character.toLowerCase(ch))) {
                return false;
            }
        }
        return true;
    }

    public static void differentSymbols(String[] sourceWords) {
        for (String word : sourceWords) {
            if (word.length() > 1 && hasUniqueChars(word)) {
                System.out.println("A word consisting only of different characters: " + word);
                return;
            }
        }
        System.out.println("No different symbols");
    }

    /**
     * Вывести на консоль новую строку, которой задублирована каждая буква из
     * начальной строки. Например, "Hello" -> "HHeelllloo".
     */
    static void doubleCharacters(String str) {
        char[] strToChar = str.toCharArray();
        StringBuilder charToStr = new StringBuilder();
        for (char c : strToChar) {
            charToStr.append(c).append(c);
        }
        System.out.println(charToStr);
    }

    /**
     * Дана строка произвольной длины с произвольными словами. Написать программу для
     * проверки является ли любое выбранное слово в строке палиндромом.
     */
    static void palindrome(String str) {
        String[] word = str.split(" ");
        System.out.println("Word number for palindrome checking");
        int num = scanner.nextInt();
        if (num <= 0 || num > word.length) {
            System.out.println("Invalid word number.");
            return;
        }
        String selectedWord = word[num - 1];
        StringBuilder reversed = new StringBuilder(selectedWord).reverse();
        if (selectedWord.equals(reversed.toString())) {
            System.out.println("The selected word is a palindrome.");
        } else {
            System.out.println("The selected word is not a palindrome.");
        }
    }
}
