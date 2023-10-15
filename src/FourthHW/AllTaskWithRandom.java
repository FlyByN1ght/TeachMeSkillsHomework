package FourthHW;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
 * массива (просто целое число). После того, как размер массива задан, заполнить его
 * одним из двух способов: используя Math.random(), или каждый элемент массива вводится
 * пользователем вручную. Попробовать оба варианта. После заполнения массива
 * данными, решить для него следующие задачи:
 *
 * @author Даниил
 * version 2.0
 */

public class AllTaskWithRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Index number: ");
        double[] array = new double[scanner.nextInt()];

        for(int i = 0; i < array.length; i++){
            array[i] = (Math.random() * 10);
        }
        System.out.println("Arrays: " + Arrays.toString(array));

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
    static int[] reverse(double[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = (int) array[i];
        }

        return newArray;
    }

    /**
     * Найти минимальный-максимальный элементы и вывести в консоль.
     * Найти индексы минимального и максимального элементов и вывести в консоль.
     * @param array исходный массив
     */
    static void maxArray (double[] array){
        int max = 0, maxIndex = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = (int) array[i];
                maxIndex = i;
            }
        }
        System.out.println("max element: " + max + " ,index: " + maxIndex);
    }

    /**
     * Найти минимальный-максимальный элементы и вывести в консоль.
     * Найти индексы минимального и максимального элементов и вывести в консоль.
     * @param array исходный массив
     */
    static void minArray (double[] array){
        int min = 9999999, minIndex = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = (int) array[i];
                minIndex = i;
            }
        }
        System.out.println("min element: " + min + " ,index: " + minIndex);
    }

    /**
     * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
     * сообщение, что их нет.
     * @param array исходный массив
     */
    static void nullArray (double[] array){
        int numNumber = 0;

        for (double j : array) {
            if (j == 0) {
                numNumber += 1;
            }
        }
        if (numNumber == 0){
            System.out.println("There are no zero elements");
        }else System.out.println("number of null elements: " + numNumber);
    }

    /**
     * Пройти по массиву и поменять местами элементы первый и последний, второй и
     * предпоследний и т.д.
     * @param array исходный массив
     * @return массив, элементы которого перевернуты
     */
    static int[] specReverse (double[] array){
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            newArray[array.length - 1 - i] = (int) array[i];
            newArray[i] = (int) array[array.length - 1 - i];
        }
        return newArray;
    }

    /**
     * Проверить, является ли массив возрастающей последовательностью (каждое следующее
     * число больше предыдущего).
     * @param array исходный массив
     */
    static void increasing (double[] array){
        boolean increasingNum = false;

        for (double j : array) {
            if (j <= array[array.length - 1]) {
                increasingNum = true;
            } else {
                increasingNum = false;
                break;
            }
        }

        if(increasingNum){
            System.out.println("the array is increasing");
        }else System.out.println("the array is not increasing");
    }

    /**
     * Имеется массив из неотрицательных чисел(любой). Представьте что массив
     * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
     * добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
     * содержит нуля в начале, кроме самого числа 0.
     * @param array исходный массив
     */
    static void onePlus (double[] array){
        int num = 0;

        for(int i = 0; i < array.length; i++){
            num = (int) (num * 10 + array[i]);
        }
        num += 1;

        String string = String.valueOf(num);
        char[] onePlus = string.toCharArray();

        System.out.println("Array with +1: " + Arrays.toString(onePlus));
    }
}