package SecondHW;

/**
 * Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskFourth {
    public static void main(String[] args) {
        // Инициализируем переменную i значением 7.
        int i = 7;

        // Используем цикл while для вывода чисел, начиная с 7 и увеличивая i на 7 на каждом шаге, пока i <= 98.
        while (i <= 98) {
            // Выводим текущее значение i.
            System.out.println(i);

            // Увеличиваем i на 7 для следующей итерации.
            i = i + 7;
        }
    }
}
