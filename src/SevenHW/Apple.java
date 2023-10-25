package SevenHW;
/**
 * Создать класс Apple и добавить в него поле color с модификатором доступа private и
 * инициализировать его. В методе main другого класса создать объект Apple, и не
 * используя сеттеры изменить значение поля color.
 *
 * @author Даниил
 * version 1.0
 */

public class Apple {
    private String color = "Red";

    public void printData() {
        System.out.println(color);
    }
}