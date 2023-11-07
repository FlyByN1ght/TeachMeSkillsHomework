package TenthHW;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User ivan = new User("Ivan", "Ivanov", 0, new Password("qwerty"));
        User ivan1 = new User("Ivan", "Ivanov", 0, new Password("qwerty"));
        System.out.println(ivan.equals(ivan1));

        User shallowClone = (User) ivan.clone();
        System.out.println("Shallow Clone: " + shallowClone);

        // Пример глубокого клонирования
        User deepClone = ivan.clone(true, 0);
        System.out.println("Deep Clone: " + deepClone);
    }
}