package SeventeenthHW;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Даниил
 * @version 1.0
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        taskOne();
        taskThree();
        taskFourth();
        taskFive();
        taskTwo();
    }

    /*
    Пользователь вводит в консоль дату своего рождения. Программа должна вернуть
    дату, когда пользователю исполнится 100 лет. Использовать Date/Time API
     */
    static void taskOne() {
        System.out.print("Enter date of birth: ");
        System.out.println("the user will be 100 years old in: " + LocalDate.parse(scanner.nextLine()).plusYears(100));
    }

    /*
    Используя Predicate среди массива чисел вывести только те, которые являются положительными.
     */
    static void taskTwo() {
        Predicate<Integer> positiveElements = x -> x >= 0;
        System.out.print("Enter the number of array elements: ");
        Integer[] array = new Integer[scanner.nextInt()];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Positive elements -> ");
        for (Integer i : array) {
            if (positiveElements.test(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    Используя Function реализовать лямбду, которая будет принимать в себя строку в
    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    возвращать сумму переведенную сразу в доллары.
     */
    static void taskThree() {
        System.out.print("Enter the line to transfer money via Function: ");
        String currency = scanner.nextLine();
        Function<String, Integer> currencyExchange = val -> {
            String[] array = val.split(" ");
            return Integer.parseInt(array[0]);
        };
        if (currency.matches("\\d+ BYN")) {
            int byn = currencyExchange.apply(currency);
            System.out.println(byn / 3.3 + " $");
        } else {
            System.out.println("Wrong currency");
        }
    }

    /*
    Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    выводить сумму переведенную сразу в доллары.
     */
    static void taskFourth() {
        System.out.print("Enter the line to transfer money via consumer: ");
        String s = scanner.nextLine();
        Consumer<String> currencyExchange = val -> {
            String[] array = val.split(" ");
            if(val.matches("\\d+ BYN")){
                int byn = Integer.parseInt(array[0]);
                System.out.println(byn / 3.3 + " $");
            }else {
                System.out.println("Wrong currency");
            }
        };
        currencyExchange.accept(s);
    }

    /*
    Используя Supplier написать метод, который будет возвращать введенную с консоли
    строку задом наперед.
     */
    static void taskFive() {
        System.out.print("Enter a string for reverse: ");
        Supplier<StringBuilder> supplier = () -> new StringBuilder(scanner.nextLine()).reverse();
        String result = supplier.get().toString();
        System.out.println(result);
    }
}
