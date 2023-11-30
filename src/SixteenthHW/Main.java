package SixteenthHW;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Даниил
 * version 1.0
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TaskOne();

        System.out.println("Enter a string for the seconds task:");
        String[] taskTwo = scanner.nextLine().split(" ");
        TaskTwo(taskTwo);

        String taskThree = "([{}])";
        boolean result = checkBrackets(taskThree);

        if (result) {
            System.out.println("The bracket are correct");
        } else {
            System.out.println("The bracket are not correct");
        }
    }

    /*
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
    строка является ключом, и ее значение равно true, если эта строка встречается в
    массиве 2 или более раз.
     */
    static void TaskOne() {
        System.out.println("Enter a string for the first task: ");
        String[] str = scanner.nextLine().split(" ");
        HashMap<String, Boolean> words = new HashMap<>();

        for (String word : str) {
            if (words.containsKey(word)) {
                words.put(word, true);
            } else {
                words.put(word, false);
            }
        }
        System.out.println(words);
    }

    /*
    На вход поступает массив непустых строк, создайте и верните Map<String,
    String> следующим образом: для каждой строки добавьте ее первый символ
    в качестве ключа с последним символом в качестве значения.
     */
    static void TaskTwo(String[] str) {
        if (str.length == 0) {
            System.out.println("String is empty");
            return;
        }

        HashMap<String, String> words = new HashMap<>();
        for (String word : str) {
            char firsLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            words.put(String.valueOf(firsLetter), String.valueOf(lastLetter));
        }
        System.out.println(words);
    }

    /*
    Задана строка, которая может иметь внутри себя следующие символы: «(»,
    «)», «[», «]», «{», «}». Проверить правильность расстановки скобок в этой строке.
     */
    static boolean checkBrackets(String taskThree) {
        Stack<Character> stack = new Stack<>();

        for (char ch : taskThree.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastOpenBracket = stack.pop();
                if ((ch == ')' && lastOpenBracket != '(') ||
                        (ch == ']' && lastOpenBracket != '[') ||
                        (ch == '}' && lastOpenBracket != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
