package code.hw7;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую
сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
*/

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        CreditCard cc1 = new CreditCard("1234 4562 7845 9632", 1523);
        System.out.println(cc1.cardInfo());

        CreditCard cc2 = new CreditCard("1894 4562 7845 9632", 568);
        System.out.println(cc2.cardInfo());

        CreditCard cc3 = new CreditCard("1984 4562 7845 9632", 4568);
        System.out.println(cc3.cardInfo());


        System.out.print("Enter money amount for transfer on card 1: ");
        cc1.moneyTransfer(num1.nextInt());

        System.out.print("Enter money amount for transfer on card 2: ");
        cc2.moneyTransfer(num1.nextInt());

        System.out.print("Enter cash amount Withdrawal on card 3: ");
        cc3.cashWithdrawal(num1.nextInt());

        System.out.println(cc1.cardInfo());
        System.out.println(cc2.cardInfo());
        System.out.println(cc3.cardInfo());
    }
}
