package EighteenthHW;

import java.util.*;

/**
 * @author Даниил
 * version 1.0
 */

public class Main {
    public static void main(String[] args) {
        taskFromLesson();
        taskOne();
        taskTwo();
    }

    /*
    При помощи стримов из списка, содержащего объекты Developer, вывести только те, id > 10 и name начинается с ‘An’.
     */
    static void taskFromLesson() {
        ArrayList<Developers> developersArrayList = new ArrayList<>();
        developersArrayList.add(new Developers(11, "Andrey"));
        developersArrayList.add(new Developers(4, "Anton"));
        developersArrayList.add(new Developers(12, "Kirill"));

        developersArrayList.stream()
                .filter(name -> name.getName().toString().startsWith("An"))
                .filter(id -> id.getId() > 10)
                .forEach(System.out::println);
    }

    /*
    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью Stream'ов:
    - Удалить дубликаты
    - Оставить только четные элементы
    - Вывести сумму оставшихся элементов в стриме
     */
    static void taskOne() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(1);
        array.add(2);
        array.add(8);
        array.add(9);

        int sum = array.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    /*
    Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать
    из этого набора только те данные, id которых попадает в числовой диапазон
    1/2/5/8/9/13. Среди отобранных значений отобрать только те, которые имеют нечетное
    количество букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
     */
    static void taskTwo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Anton");
        map.put(2, "Dima");
        map.put(3, "Dasha");
        map.put(4, "Daniil");
        map.put(5, "Marina");
        map.put(6, "Liza");
        map.put(7, "Aleksei");
        map.put(8, "Bogdan");
        map.put(9, "Stana");
        map.put(10, "Kolya");
        map.put(11, "Giga");
        map.put(12, "Chad");
        map.put(13, "No");

        int[] range = {1, 2, 5, 8, 9, 13};
        StringBuilder builder = new StringBuilder();
        map.entrySet().stream()
                .filter(id -> idSorted(range, id.getKey()))
                .filter(name -> name.getValue().length() % 2 != 0)
                .map(Map.Entry::getValue)
                .forEach(value -> builder.append(" ").append(value));
        builder.delete(0, 1);
        System.out.println(builder.reverse().toString());
    }

    /*
    метод проверяющий числовой диапазон id
     */
    static boolean idSorted(int[] array, int id) {
        for (int rangeId : array) {
            if (id == rangeId) {
                return true;
            }
        }
        return false;
    }
}
