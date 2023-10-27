package EighthHW;

/**
 * @author Даниил
 * version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Animals tiger = new Tiger();
        Animals rabbit = new Rabbit();
        Dog.Builder dog = new Dog.Builder();

        dog.eat("Meat");
        dog.eat("Glass");
        dog.voice();

        tiger.eat("Meat");
        tiger.eat("Glass");
        tiger.voice();

        rabbit.eat("Grass");
        rabbit.eat("Meat");
        rabbit.voice();
    }
}