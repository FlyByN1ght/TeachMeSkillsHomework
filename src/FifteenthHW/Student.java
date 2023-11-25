package FifteenthHW;

import java.util.ArrayList;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
 * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3. Если средний
 * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
 * printStudents(List<Student> students, int course), который получает список студентов и
 * номер курса. А также печатает на консоль имена тех студентов из списка, которые
 * обучаются на данном курсе.
 *
 * @author Даниил
 * version 1.0
 */
public class Student {
    private final String NAME;
    private final int AGE;
    private String curs;
    private final int[] ASSESSMENTS;
    private static final ArrayList<Student> students = new ArrayList<>();

    public Student(String name, int age, String curs, int[] assessments) {
        this.NAME = name;
        this.AGE = age;
        this.curs = curs;
        this.ASSESSMENTS = assessments;
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public double average() {
        int sum = 0;
        for (int assessment : ASSESSMENTS) {
            sum += assessment;
        }
        return (double) sum / ASSESSMENTS.length;
    }

    public static void studentsFilter() {
        ArrayList<Student> studentsToRemove = new ArrayList<>();

        for (Student s : students) {
            double average = s.average();

            if (average < 3) {
                studentsToRemove.add(s);
            } else {
                if ("4".equals(s.curs)) {
                    s.curs = "Graduate";
                } else {
                    s.curs = String.valueOf(Integer.parseInt(s.curs) + 1);
                }
            }
        }
        students.removeAll(studentsToRemove);
    }

    @Override
    public String toString() {
        return "Name: " + NAME;
    }

    public static void printStudentOnCurse(String curse) {
        for (Student s : students) {
            if (s.curs.equals(curse)) {
                System.out.println(s.toString());
            }
        }
    }

    public static void printAllStudents() {
        for (Student s : students) {
            System.out.println("Name: " + s.NAME +
                    ", Age: " + s.AGE +
                    ", Course: " + s.curs +
                    ", Assessments: " + java.util.Arrays.toString(s.ASSESSMENTS));
        }
    }
}