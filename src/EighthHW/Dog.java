package EighthHW;

import java.util.Objects;

/**
 * Написать такой конструктор, который запретит создание объекта класса Dog в других
 * классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
 * обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
 * способа.
 *
 * @author Даниил
 * version 1.0
 */
public class Dog extends Animals {

    private Dog(String eat) {

    }

    public static class Builder {

        void voice() {
            System.out.println("Dog voice: Gaf gaf gaf");
        }


        void eat(String eat) {
            if (Objects.equals(eat, "Meat")) {
                System.out.println("Yes, it's i like...Yummy");
            } else {
                System.out.println("I don't eat them");
            }
        }
    }
}
