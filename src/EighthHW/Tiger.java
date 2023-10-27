package EighthHW;

import java.util.Objects;

/**
 * @author Даниил
 * version 1.0
 */
public class Tiger extends Animals {

    @Override
    void voice() {
        System.out.println("Tiger voice: Raaaar");
    }

    @Override
    void eat(String eat) {
        if (Objects.equals(eat, "Meat")) {
            System.out.println("Yes, it's i like...Yummy");
        } else {
            System.out.println("I don't eat them");
        }
    }
}
