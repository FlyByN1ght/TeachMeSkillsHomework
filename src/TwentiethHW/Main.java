package TwentiethHW;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Даниил
 * version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        TaskOne(array);
        TaskTwo(array);
    }

    /*
    Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
    потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
    вычислений возвращаются в метод main().
     */
    static void TaskOne(int[] array) {
        MaxElements maxElements = new MaxElements(array);
        MinElements minElements = new MinElements(array);
        Thread maxElement = new Thread(maxElements);
        Thread minElement = new Thread(minElements);
        maxElement.start();
        minElement.start();

        try {
            maxElement.join();
            minElement.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int max = maxElements.getMax();
        int min = minElements.getMin();
        System.out.println("Max elements = " + max + ", min elements = " + min);
    }

    /*
    Сортировка массива цифр в нескольких потоках различными алгоритмами:
    - сортировка вставками;
    - сортировка выбором;
    - сортировка пузырьком.
    Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
    результат отсортированных массивов в консоль.
     */
    static void TaskTwo(int[] array) {
        InsertionSort insertionSort = new InsertionSort(Arrays.copyOf(array, array.length));
        SelectionSort selectionSort = new SelectionSort(Arrays.copyOf(array, array.length));
        BubbleSort bubbleSort = new BubbleSort(Arrays.copyOf(array, array.length));

        Thread insertionThread = new Thread(insertionSort);
        Thread selectionThread = new Thread(selectionSort);
        Thread bubbleThread = new Thread(bubbleSort);

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        try {
            insertionThread.join();
            selectionThread.join();
            bubbleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Insertion Sort: " + Arrays.toString(insertionSort.getArray()));
        System.out.println("Selection Sort: " + Arrays.toString(selectionSort.getArray()));
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSort.getArray()));
    }
}
