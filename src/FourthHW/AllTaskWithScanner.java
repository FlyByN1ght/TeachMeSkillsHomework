package FourthHW;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
 * массива (просто целое число). После того, как размер массива задан, заполнить его
 * одним из двух способов: используя Math.random(), или каждый элемент массива вводится
 * пользователем вручную. Попробовать оба варианта. После заполнения массива
 * данными, решить для него следующие задачи:
 *
 * @author Даниил
 * version 2.0
 */

public class AllTaskWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Index number: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println("Enter the Cost Matrix:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));

        int[] reversedArray = reverse(array);
        System.out.println("Reversed array : " + Arrays.toString(reversedArray));

        maxArray(array);
        minArray(array);
        nullArray(array);

        int[] specReversedArray = specReverse(array);
        System.out.println("special reversed array : " + Arrays.toString(specReversedArray));

        increasing(array);

        onePlus(array);
    }

    /**
     * Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
     *
     * @param array исходный массив
     * @return массив, элементы которого идут в обратном порядке по сравнению с исходным
     */
    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        return newArray;
    }

    /**
     * Найти минимальный-максимальный элементы и вывести в консоль.
     * Найти индексы минимального и максимального элементов и вывести в консоль.
     *
     * @param array исходный массив
     */
    static void maxArray(int[] array) {
        int max = 0, maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("max element: " + max + " ,index: " + maxIndex);
    }

    /**
     * Найти минимальный-максимальный элементы и вывести в консоль.
     * Найти индексы минимального и максимального элементов и вывести в консоль.
     *
     * @param array исходный массив
     */
    static void minArray(int[] array) {
        int min = array[0], minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("min element: " + min + " ,index: " + minIndex);
    }

    /**
     * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
     * сообщение, что их нет.
     *
     * @param array исходный массив
     */
    static void nullArray(int[] array) {
        int numNumber = 0;

        for (int j : array) {
            if (j == 0) {
                numNumber += 1;
            }
        }
        if (numNumber == 0) {
            System.out.println("There are no zero elements");
        } else System.out.println("number of null elements: " + numNumber);
    }

    /**
     * Пройти по массиву и поменять местами элементы первый и последний, второй и
     * предпоследний и т.д.
     *
     * @param array исходный массив
     * @return массив, элементы которого перевернуты
     */
    static int[] specReverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    /**
     * Проверить, является ли массив возрастающей последовательностью (каждое следующее
     * число больше предыдущего).
     *
     * @param array исходный массив
     */
    static void increasing (int[] array){
        boolean increasingNum = false;

        for (int i = 1;i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                increasingNum = false;
                break;
            }if (array[i] > array[i - 1]){
                increasingNum = true;
            }
        }

        if(increasingNum){
            System.out.println("the array is increasing");
        } else System.out.println("the array is not increasing");
    }

    /**
     * Имеется массив из неотрицательных чисел(любой). Представьте что массив
     * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
     * добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
     * содержит нуля в начале, кроме самого числа 0.
     *
     * @param array исходный массив
     */
    static void onePlus(int[] array) {
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            num = num * 10 + array[i];
        }
        num += 1;

        String string = String.valueOf(num);
        char[] onePlus = string.toCharArray();

        System.out.println("Array with +1: " + Arrays.toString(onePlus));
    }
}