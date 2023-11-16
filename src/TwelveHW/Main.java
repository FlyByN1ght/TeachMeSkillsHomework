package TwelveHW;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Даниил
 * version 1.0
 */

public class Main {
    public static void main(String[] args) {
        /*
        Вывести в консоль из строки которую пользователь вводит с клавиатуры все
        аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
        только из прописных букв, без чисел.
         */
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        System.out.print("Enter an offer: ");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        System.out.println("Abbreviation in a sentence:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        /*
        Программа на вход получает произвольный текст. В этом тексте может быть номер
        документа(один или несколько), емейл и номер телефона. Номер документа в
        формате: xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате:
        +(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
        содержать номер телефона, или другое.
         */

        String file = "C:\\Users\\Daniil\\IdeaProjects\\TeachMeSkillsHomework\\src\\TwelveHW\\file.txt";

        try {
            String[] linesArray = Files.readAllLines(Paths.get(file)).toArray(new String[0]);

            // Создание массива паттернов
            Pattern[] patterns = {
                    Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}"),
                    Pattern.compile("\\+\\(\\d{2}\\)\\d{7}"),
                    Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b")
            };

            for (String line : linesArray) {
                for (Pattern pat : patterns) {
                    Matcher matcher1 = pat.matcher(line);
                    while (matcher1.find()) {
                        System.out.println("Match found: " + matcher1.group() +
                                " for pattern: " + pat.pattern());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}