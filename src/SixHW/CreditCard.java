package SixHW;

import java.util.Scanner;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
 * метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
 * который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
 * выводит текущую информацию о карточке. Напишите программу, которая создает три
 * объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 *
 * @author Даниил
 * version 1.0
 */
public class CreditCard {
    int accountNumber; // Номер счета
    double currentAmountInAccount; // Текущая сумма на счете
    Scanner scanner; // Объект Scanner для ввода данных

    // Конструктор класса
    public CreditCard(int accountNumber, double currentAmountInAccount) {
        this.accountNumber = accountNumber;
        this.currentAmountInAccount = currentAmountInAccount;
        this.scanner = new Scanner(System.in);
    }

    // Метод для пополнения счета
    public void addSumInAccount() {
        System.out.println("Enter the amount to top up: ");
        currentAmountInAccount += scanner.nextDouble();
    }

    // Метод для снятия средств со счета
    public void withdrawSumInAccount() {
        System.out.println("Enter the amount to withdraw: ");
        currentAmountInAccount -= scanner.nextDouble();
    }

    // Метод для вывода информации о карте
    public void infoAboutCard() {
        System.out.println("Card number: " + accountNumber + ", amount on account: " + currentAmountInAccount);
    }
}
