package EighthHW;

/**
 *Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
 * Переопределить методы voice(), eat(String food) чтобы они выводили верную
 * информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
 *
 * @author Даниил
 * version 1.0
 */
public class Animals {

    void voice() {
        System.out.println("*Should be some voice");
    }

    void eat(String eat) {
        System.out.println("*Should be some eat");
    }
}
