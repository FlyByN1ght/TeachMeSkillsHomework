package FifthHW;

import java.util.Random;
import java.util.Scanner;

/**
 * 1.1 Создать двумерный массив, заполнить его случайными числами.
 * 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
 * 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
 *
 * @author Даниил
 * version 2.0
 */
public class TaskOne {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int[][] array;

    public static void main(String[] args) {
        // Инициализация массива
        array = new int[5][5];
        // Генерация случайных значений для массива
        array = generateArray(array);
        // Вывод оригинального массива
        printArray(array);
        // Добавление пользовательского ввода к каждому элементу массива
        array = plusScanner(array);
        // Вывод измененного массива
        printArray(array);
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

    // Метод для генерации случайного двумерного массива
    static int[][] generateArray(int[][] array) {
        int[][] createArray = new int[array.length][array.length];
        for (int i = 0; i < createArray.length; i++) {
            for (int j = 0; j < createArray[i].length; j++) {
                createArray[i][j] = random.nextInt(0, 1);
            }
        }
        return createArray;
    }

    // Метод для добавления числа, введенного пользователем, к каждому элементу массива
    static int[][] plusScanner(int[][] array) {
        int[][] plusArray = new int[array.length][array.length];
        System.out.print("Enter a number to add to the array elements: ");
        int num = scanner.nextInt();

        for (int i = 0; i < plusArray.length; i++) {
            for (int j = 0; j < plusArray[i].length; j++) {
                plusArray[i][j] += num;
            }
        }
        return plusArray;
    }
}
