package FirstHW;

import java.util.Scanner;

/**
 * В переменной n хранится двузначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр n.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskTwo {
    public static void main(String[] args) {

        // Создаем объект Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");

        // Считываем введенное значение и сохраняем его в переменной numberN.
        int numberN = scanner.nextInt();

        // Объявляем переменные a, b и result для выполнения вычислений.
        int a, b, result;

        // Разбиваем число на десятки (a) и единицы (b).
        a = numberN / 10;
        b = numberN % 10;

        // Суммируем значения десяток и единиц и сохраняем результат в переменной result.
        result = a + b;

        System.out.println("сумма чисел n = " + result);
    }
}
