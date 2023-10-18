package FifthHW;

/**
 * Создать программу для раскраски шахматной доски с помощью цикла. Создать
 * двумерный массив String 8х8. С помощью циклов задать элементам массива значения
 * B(Black) или W(White).
 *
 * @author Даниил
 * version 2.0
 */
public class TaskTwo {
    public static void main(String[] args) {
        // Создание двумерного массива строк размером 8x8
        String[][] string = new String[8][8];

        // Заполнение массива строками "W" и "B" в шахматном порядке
        for (int i = 0; i < string.length; i++) {
            // Определение начальной строки в зависимости от четности индекса i
            String start = (i % 2 == 0 ? "W" : "B");
            for (int j = 0; j < string[i].length; j++) {
                // Заполнение текущей ячейки массива строкой "W" или "B"
                string[i][j] = start;
                // Смена цвета для следующей ячейки
                start = ((start.equals("W")) ? "B" : "W");
            }
        }
        // Вывод массива на экран
        for (String[] i : string) {
            for (String s : i) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}