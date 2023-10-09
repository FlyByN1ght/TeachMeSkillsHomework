package SecondHW;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А
 * программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
 * числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
 * ввести некорректные данные.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskFive {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);

        // Выводим приглашение для пользователя ввести число.
        System.out.print("Введите число:");

        // Инициализируем переменную для хранения суммы чисел и присваиваем ей значение 0.
        int result = 0;

        // Проверяем, ввел ли пользователь целое число.
        if (scanner.hasNextInt()) {
            // Считываем введенное пользователем число.
            int num = scanner.nextInt();

            // Используем цикл for для вычисления суммы чисел от 1 до введенного пользователем числа.
            for (int i = 0; i <= num; i++) {
                result = result + i;
            }

            // Выводим результат на экран.
            System.out.println("сумма всех чисел от 1 до введенного пользователем = " + result);
        } else {
            // Выводим сообщение об ошибке, если ввод пользователя не является целым числом.
            System.out.println("Неправильный ввод");
        }
    }
}