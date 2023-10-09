package FirstHW;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
 * программу, округляющую число n до ближайшего целого и выводящую результат на
 * экран.
 *
 * @author Даниил
 * version 1.0
 */
public class TaskFour {
    public static void main(String[] args) {

        // Создаем объект Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);
        // Считываем введенное пользователем вещественное число и сохраняем его в переменной numDouble.
        double numDouble = scanner.nextDouble();
        int i = (int)(numDouble + 0.5);

        System.out.println(i);
    }
}
