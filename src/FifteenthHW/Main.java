package FifteenthHW;

import java.util.*;

/**
 * @author Даниил
 * version 1.0
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //вызов метода для задания 1
        TaskOne();

        //вызов методов для задания 2
        Animals.addAnimals("Cat");
        Animals.addAnimals("Capybara");
        Animals.addAnimals("Wolf");
        Animals.addAnimals("Dog");
        Animals.removeAnimals();
        System.out.println(Animals.getArrayAnimals());

        //вызов методов для задания 3
        Student student = new Student("Petr", 19, "2", new int[]{6, 3, 5, 9, 10});
        Student student1 = new Student("Oleg", 18, "1", new int[]{4, 2, 4, 5, 7});
        Student student2 = new Student("Natasha", 20, "3", new int[]{2, 3, 2, 1, 1});
        Student student3 = new Student("Dasha", 21, "4", new int[]{6, 6, 7, 2, 10});

        Student.addStudent(student);
        Student.addStudent(student1);
        Student.addStudent(student2);
        Student.addStudent(student3);

        Student.printStudentOnCurse("4");
        Student.studentsFilter();
        Student.printAllStudents();

        //объявление своей коллекции для задания 4
        MyCollection<ComputerElements> collection = new MyCollection<>();

        Mouse mouse = new Mouse("Wireless Mouse", 3);
        Keyboard keyboard = new Keyboard("Mechanical Keyboard", 104);

        collection.addItem(mouse);
        collection.addItem(keyboard);

        collection.displayItems();

        //удаление элемента из односвязного списка
        RemoveElements head = new RemoveElements(31, null);
        head.next = new RemoveElements(27, null);
        head.next.next = new RemoveElements(666, null);
        head.next.next.next = new RemoveElements(26, null);
        head.next.next.next.next = new RemoveElements(28, null);

        head = removeElement(head, 31);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        //проверка на палиндром
        Palindrome one = new Palindrome(1);
        Palindrome two = new Palindrome(2);
        Palindrome three = new Palindrome(3);
        Palindrome four = new Palindrome(4);
        Palindrome five = new Palindrome(3);
        Palindrome six = new Palindrome(2);
        Palindrome seven = new Palindrome(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        boolean result = isPalindrome(one);
        System.out.println("is palindrome :" + result);
    }

    /*
    Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2,
    3, 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на
    экран. При решении использовать коллекции.
     */
    static void TaskOne() {
        System.out.print("Enter a set of numbers separated by commas: ");
        String inputString = scanner.nextLine();

        String[] numbersArray = inputString.split(", ");

        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbersArray));

        System.out.println("Результат: " + uniqueNumbers);
    }

    /*
    есть односвязный список и пользователь передает число. Задача удалить все ноды с этим числом.
     */
    public static RemoveElements removeElement(RemoveElements head, int target) {
        RemoveElements dummy = new RemoveElements(-1, null);
        dummy.next = head;

        RemoveElements curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == target)
                curr.next = curr.next.next;
            else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    /*
    Проверить на палиндром через односвязный список
     */
    static boolean isPalindrome(Palindrome head) {

        Palindrome slow = head;
        boolean isPalindrome = false;
        Stack<Integer> stack = new Stack<Integer>();

        // Помещаем элементы первой половины связного списка в стек
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        // Сравниваем вторую половину связного списка с элементами, извлеченными из стека
        while (head != null) {

            int i = stack.pop();
            if (head.data == i) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.ptr;
        }
        return isPalindrome;
    }
}
