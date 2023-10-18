package FifthHW;

import java.util.Scanner;

/**
 * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой
 *
 * @author Даниил
 * version 2.0
 */
public class TaskThree {
    static int[][] array;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Запрос у пользователя количества строк и столбцов
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = scanner.nextInt();

        // Создание и заполнение массива
        array = new int[n][m];
        generateArray(array, n, m);
        System.out.println("Ваш массив:");
        // Вывод исходного массива
        printArray(array);
        // Вывод измененного массива
        snake(array);
        printArray(array);
    }

    // Метод для генерации массива с учетом заданного количества строк и столбцов
    static void generateArray(int[][] array, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = i * m + j;
            }
        }
    }

    // Метод для вывода двумерного массива
    static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    // Метод для преобразования массива "змейкой"
    static void snake(int[][] array) {
        System.out.println("Ваш массив змейкой:");
        for (int i = 0; i < array.length; i++) {
            // Если строка нечетная, меняем порядок элементов
            if (i % 2 != 0) {
                for (int j = 0; j < array[i].length / 2; j++) {
                    // Обмен значений между элементами массива
                    int temp = array[i][j];
                    array[i][j] = array[i][array[i].length - 1 - j];
                    array[i][array[i].length - 1 - j] = temp;
                }
            }
        }
    }
}