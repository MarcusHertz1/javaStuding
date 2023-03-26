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

public class T3 {
    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard(1, "1234 4562 7845 9632", 1523);
        String cc1Info = cc1.cardInfo();
        System.out.println(cc1Info);

        CreditCard cc2 = new CreditCard(2, "1894 4562 7845 9632", 568);
        String cc2Info = cc2.cardInfo();
        System.out.println(cc2Info);

        CreditCard cc3 = new CreditCard(3, "1984 4562 7845 9632", 4568);
        String cc3Info = cc3.cardInfo();
        System.out.println(cc3Info);
    }
}
