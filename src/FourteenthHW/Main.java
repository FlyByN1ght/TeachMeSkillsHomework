package FourteenthHW;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Даниил
 * version 1.0
 */

public class Main {
    public static void main(String[] args) {
        /*
        В задании приложен файл Ромео и Джульетта на английском, вычитать его в Idea.
        Проанализировать и записать в другой файл самое длинное слово.
         */
        StringBuilder recordBook = new StringBuilder();
        try (
                FileReader fileInput = new FileReader("C:\\Users\\Daniil\\IdeaProjects\\TeachMeSkillsHomework\\src" +
                        "\\FourteenthHW\\romeo-and-juliet.txt");
                FileWriter fileOutput = new FileWriter("C:\\Users\\Daniil\\IdeaProjects\\TeachMeSkillsHomework\\src" +
                        "\\FourteenthHW\\maxMinWord.txt")
        ) {
            int i;
            while ((i = fileInput.read()) != -1) {
                recordBook.append((char) i);
            }

            String book = recordBook.toString();

            book = book.replace("=", " ");
            book = book.replace(",", " ");

            String[] word = book.split("\\s+");

            String min = word[0];
            String max = word[0];

            for (String words : word) {
                if (words.length() < min.length()) {
                    min = words;
                }

                if (words.length() > max.length()) {
                    max = words;
                }
            }
            fileOutput.write("Max word: ");
            fileOutput.write(max);
            fileOutput.append("\n");
            fileOutput.write("Min word: ");
            fileOutput.write(min);
            fileOutput.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Допустим есть txt файл с номерами документов. Номером документа является строка,
        состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит
        каждый номер документа с новой строки и в строке никакой другой информации,
        только номер документа. Валидный номер документа должен иметь длину 15
        символов и начинаться с последовательности docnum(далее любая
        последовательность букв/цифр) или contract(далее любая последовательность
        букв/цифр). Написать программу для чтения информации из входного файла - путь к
        входному файлу должен задаваться через консоль. Программа должна проверять
        номера документов на валидность. Валидные номера документов следует записать в
        один файл-отчет. Невалидные номера документов следует записать в другой файл-отчет,
        но после номеров документов следует добавить информацию о том,
        почему этот документ не валиден.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу:");
        String pathFile = scanner.nextLine();
        File file = new File(pathFile);

        try (
             Scanner fileScanner = new Scanner(file);
             FileWriter validDocument = new FileWriter("C:\\Users\\Daniil\\IdeaProjects\\TeachMeSkillsHomework\\src" +
                     "\\FourteenthHW\\validDoc.txt");
             FileWriter notValidDocument = new FileWriter("C:\\Users\\Daniil\\IdeaProjects\\TeachMeSkillsHomework\\src" +
                     "\\FourteenthHW\\notValidDoc.txt")
        ) {
            // Считать строки из файла и записать их в массив
            StringBuilder stringBuilder = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                stringBuilder.append(fileScanner.nextLine()).append(System.lineSeparator());
            }
            String[] linesArray = stringBuilder.toString().split(System.lineSeparator());

            for (String line : linesArray) {
                    if(line.matches("^docnum[A-Za-z0-9]{9}$") || line.matches("^contract[A-Za-z0-9]{7}$")){
                        validDocument.write(line);
                        validDocument.append("\n");
                    } else {
                        notValidDocument.write(line);
                        notValidDocument.append(" - невалидный по следующей причине: ");

                        if (line.length() < 15) {
                            notValidDocument.append("слишком короткий");
                        } else if (!line.startsWith("docnum") || line.startsWith("contract")) {
                            notValidDocument.append("не соответствует формату 'docnum' или 'contract'");
                        } else {
                            notValidDocument.append("неизвестная причина");
                        }
                        notValidDocument.append('\n');
                    }
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
