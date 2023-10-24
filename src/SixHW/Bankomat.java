package SixHW;

/**
 * Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате,
 * должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
 * Сделать метод для добавления денег в банкомат. Сделать функцию, снимающую
 * деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
 * выполнения операции. При снятии денег, функция должна распечатывать каким
 * количеством купюр какого номинала выдаётся сумма. Создать конструктор с тремя
 * параметрами - количеством купюр каждого номинала
 *
 * @author Даниил
 * version 2.0
 */

public class Bankomat {
    int money20; // Количество банкнот номиналом 20
    int money50; // Количество банкнот номиналом 50
    int money100; // Количество банкнот номиналом 100

    // Конструктор класса
    public Bankomat(int money20, int money50, int money100) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int add_20, int add_50, int add_100) {
        this.money20 += add_20;
        this.money50 += add_50;
        this.money100 += add_100;
    }

    // Метод для получения общей суммы денег в банкомате
    public int getTotalAmount() {
        return money20 * 20 + money50 * 50 + money100 * 100;
    }

    // Метод для снятия денег из банкомата
    public boolean withdrawMoney(int amount) {

        if (amount > getTotalAmount()) {
            System.out.println("It is impossible to issue this amount");
            return false;
        }

        int money100 = Math.min(this.money100, amount / 100);
        amount -= money100 * 100;
        int money50 = Math.min(this.money50, amount / 50);
        amount -= money50 * 50;
        int money20 = Math.min(this.money20, amount / 20);
        amount -= money20 * 20;

        if (amount != 0) {
            System.out.println("It is impossible to issue this amount");
            return false;
        }

        this.money100 -= money100;
        this.money50 -= money50;
        this.money20 -= money20;

        System.out.println("100 banknotes issued: " + money100 + ", 50 banknotes issued: " + money50 + "\n" +
                "20 banknotes issued: " + money20);
        return true;
    }
}