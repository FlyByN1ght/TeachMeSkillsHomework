package SixHW;
/**
 *main class
 *
 * @author Даниил
 * version 1.0
 */

public class Main {
    public static void main(String[] args) {
        CreditCard cardOne = new CreditCard(1, 100);
        CreditCard cardTwo = new CreditCard(2, 200);
        CreditCard cardThree = new CreditCard(3, 300);
        cardOne.addSumInAccount();
        cardTwo.addSumInAccount();
        cardThree.withdrawSumInAccount();
        cardOne.infoAboutCard();
        cardTwo.infoAboutCard();
        cardThree.infoAboutCard();
        Bankomat bank = new Bankomat(100,100,100);
        bank.addMoney(1,1,1);
        System.out.println("-------------------");
        bank.withdrawMoney(340);
        System.out.println("-------------------");
        bank.withdrawMoney(10);
        System.out.println("-------------------");
        bank.withdrawMoney(270);
    }
}