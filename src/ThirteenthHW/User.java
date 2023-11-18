package ThirteenthHW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать класс, в котором будет статический метод. Этот метод принимает на вход три
 * параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
 * login должна быть меньше 20 символов и не должен содержать пробелы. Если login
 * несоответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
 * password должна быть меньше 20 символов, не должен содержать пробелом и должен
 * содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить
 * WrongPasswordException. WrongPasswordException и WrongLoginException -
 * пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса
 * Exception. Метод возвращает true, если значения верны
 *
 * @author Даниил
 * version 1.0
 */
public class User {

    public static void access(String login, String password, String confirmPassword) {
        Pattern pattern = Pattern.compile("^[A-z0-9]{2,20}$");
        Matcher matcher = pattern.matcher(login);
        Pattern patternPassword = Pattern.compile("^(?:[A-z]*\\d[A-z0-9]{2,20})$");
        Matcher matcherPassword = patternPassword.matcher(password);
        //login check
        try {
            if (matcher.find()) {
                System.out.println("Login access");
            } else {
                throw new WrongLoginException(login);
            }
            //password check
            try {
                if (password.equals(confirmPassword) && matcherPassword.find()) {
                    System.out.println("Password access");
                } else {
                    throw new WrongPasswordException(password);
                }
            } catch (WrongPasswordException e) {
                e.printStackTrace();
            }
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
    }
}
