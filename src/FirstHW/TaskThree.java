package FirstHW;

import java.util.Scanner;

/**
 * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр n.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskThree {
    public static void main(String[] args) {

        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");

        // Считываем введенное значение и сохраняем его в переменной numberN.
        int numberN = scanner.nextInt();
        // Объявляем переменные a, b, c и result для выполнения вычислений.
        int a, b, c, result;

        // Разбиваем число на сотни (a), десятки (b) и единицы (c).
        a = numberN / 100;
        b = numberN / 10 ;
        b = b % 10;
        c = numberN % 10;

        result = a + b + c;

        System.out.println("сумма чисел n = " + result);
    }
}
