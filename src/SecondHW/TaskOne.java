package SecondHW;

import java.util.Scanner;

/**
 * Напишите программу, которая будет принимать на вход число из консоли и на выход
 * будет выводить сообщение четное число или нет. Для определения четности числа
 * используйте операцию получения остатка от деления.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskOne {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);
        // Выводим приглашение для пользователя ввести число для проверки.
        System.out.print("Введите число на проверку: ");

        // Считываем введенное пользователем число и сохраняем его в переменной number.
        int number = scanner.nextInt();

        // Проверяем, является ли число четным, используя операцию деления по модулю на 2.
        if (number % 2 == 0) {
            System.out.println("Ваше число чётное");
        } else {
            System.out.println("Ваше число нечётное");
        }
    }
}