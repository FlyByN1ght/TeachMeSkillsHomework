package SecondHW;

import java.util.Scanner;

/**
 * Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
 * Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 *
 * @author Даниил
 * version 1.0
 */
public class TaskTwo {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);

        // Считываем введенное пользователем значение и сохраняем его в переменной t.
        int t = scanner.nextInt();

        // Проверяем условие: если t больше -5, выводим "Warm".
        if (t > -5) {
            System.out.println("Warm");
        }
        // Иначе, если t больше -20, выводим "Normal".
        else if (t > -20) {
            System.out.println("Normal");
        }
        // В противном случае выводим "Cold".
        else {
            System.out.println("Cold");
        }
    }
}
