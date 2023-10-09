package SecondHW;

/**
 * Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskThird {
    public static void main(String[] args) {
        // Объявляем переменную для хранения квадрата числа.
        int square;

        // Используем цикл for для перебора чисел от 10 до 20.
        for (int i = 10; i <= 20; i++) {
            // Вычисляем квадрат текущего числа.
            square = i * i;

            // Выводим на экран сообщение о квадрате числа.
            System.out.println("квадрат числа " + i + " = " + square);
        }
    }
}
