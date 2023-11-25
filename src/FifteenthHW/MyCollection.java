package FifteenthHW;

import java.util.Arrays;

/**
 * Представим, что в Java нет коллекции типа ArrayList. Создать свой класс,
 * симулирующий работу класса динамической коллекции - т.е. создать свою кастомную
 * коллекцию. В основе коллекции будет массив. Кастомная коллекция должна хранить
 * элементы разных классов(т.е. это generic).
 *
 * @author Даниил
 * version 1.0
 */
public class MyCollection<T extends ComputerElements> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] items;
    private int size;

    public MyCollection() {
        this.items = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void addItem(T item) {
        ensureCapacity();
        items[size++] = item;
    }

    public void displayItems() {
        for (int i = 0; i < size; i++) {
            ComputerElements item = (ComputerElements) items[i];
            System.out.println(item.getName());
        }
    }

    //проверка на заполненость массива
    private void ensureCapacity() {
        if (size == items.length) {
            int newCapacity = items.length * 2;
            items = Arrays.copyOf(items, newCapacity);
        }
    }
}
