package FirstHW;

import java.util.Scanner;

/**
 * Написать приложение, которое будет вычислять и выводить значение по формуле:
 * a=4*(b+c-1)/2;
 *
 * @author Даниил
 * version 1.0
 */
public class TaskOne {
    public static void main(String[] args) {
        int a;// создаём переменную a для хранения результата

        System.out.println("Введите числа b и с");

        // Создаем два объекта Scanner для считывания ввода пользователя.
        Scanner scanner = new Scanner(System.in);

        // Считываем введенные значения и сохраняем их в переменные numberB и numberC.
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();

        a = 4 * (numberB + numberC - 1) / 2;

        System.out.println("a = 4 * (b + c - 1) / 2 =" + a);
    }
}
