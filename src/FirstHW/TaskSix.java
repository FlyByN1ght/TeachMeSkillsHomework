package FirstHW;

import java.util.Scanner;
/**
 * Написать программу которая будет менять местами значение целочисленных
 * переменных
 *
 * @author Даниил
 * version 1.0
*/

public class TaskSix {
    public static void main(String[] args) {

        System.out.println("Введите числа a и b");

        // Создаем два объекта Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);

        // Считываем введенные значения и сохраняем их в переменные numberA и numberB.
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        // Обмениваем значения переменных numberA и numberB.
        numberA += numberB;
        numberB = numberA - numberB;
        numberA = numberA - numberB;
        System.out.println("a = " + numberA + "  b = " + numberB);
    }
}