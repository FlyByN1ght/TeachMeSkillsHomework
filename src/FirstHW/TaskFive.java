package FirstHW;

import java.util.Scanner;

/**
 * В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
 * на экран результат деления q на w с остатком.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskFive {
    public static void main(String[] args) {

        System.out.println("Введите значения q и w");
        // Создаем два объекта Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);

        // Считываем введенные значения и сохраняем их в переменных q и w.
        int q = scanner.nextInt();
        int w = scanner.nextInt();

        // Вычисляем результат целочисленного деления q на w и остатка от деления.
        int resultQ = q / w;
        int resultW = q % w;

        System.out.println(resultQ + " " + resultW);
    }
}
