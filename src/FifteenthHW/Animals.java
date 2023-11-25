package FifteenthHW;

import java.util.LinkedList;

/**
 * Создать класс, который будет хранить в себе коллекцию с названиями животных.
 * Реализовать методы удаления и добавления животных по следующим правилам:
 * добавляется всегда в конец коллекции, а удаляется всегда из начала. Показать работу
 * объекта этого класса в main методе другого класса.
 *
 * @author Даниил
 * version 1.0
 */
public class Animals {
    private static final LinkedList<String> arrayAnimals = new LinkedList<>();

    public static void addAnimals(String animal) {
        arrayAnimals.addLast(animal);
    }

    public static void removeAnimals() {
        arrayAnimals.removeFirst();
    }

    public static LinkedList<String> getArrayAnimals() {
        return arrayAnimals;
    }
}
