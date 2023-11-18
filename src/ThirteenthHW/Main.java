package ThirteenthHW;

/**
 *
 * @author Даниил
 * version 1.0
 */
public class Main {
    public static void main(String[] args) {
        User.access("Ivan228", "nU1ll", "nU1ll");

        //Написать try/catch/finally, в котором finally вызван не будет.
        try {
            System.out.println("This is try before finally");
            System.exit(0);
        } finally {
            System.out.println("Это finally");
        }
    }
}
