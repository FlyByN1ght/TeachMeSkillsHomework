package EighthHW;

import java.util.Objects;

/**
 * @author Даниил
 * version 1.0
 */
public class Rabbit extends Animals {

    @Override
    void voice() {
        System.out.println("Rabbit voice: Buh");
    }

    @Override
    void eat(String eat) {
        if (Objects.equals(eat, "Grass")) {
            System.out.println("Yes, it's i like...Yummy");
        } else {
            System.out.println("I don't eat them");
        }
    }
}
