package code.hw9.T1;

/*Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы:
receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для
инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает
два параметра - имя звонящего и номер телефона звонящего.
Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины
(пример: https://metanit.com/java/tutorial/2.16.php).
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.
(Дополнительно) Развить иерархию классов Phone, CellPhone, SmartPhone, SatellitePhone и
раскидать реализованные методы в соответствии с возможностями каждого телефона
*/

public class Main {
    public static void main(String[] args) {

        String s21Number = "+385 12 658 56 21";

        Phone iPhone = new Phone(s21Number, "IPhone 14 Pro Max", 295);
        Phone s21 = new Phone("+385 12 956 56 21", "S21 Ultra", 255);
        Phone s232 = new Phone("+385 12 998 34 21", "S232 Ultra");

        System.out.println(iPhone.info());
        System.out.println(s21.info());
        System.out.println(s232.info());

        System.out.println(iPhone.receiveCall("Gym") + iPhone.getNumber("+98 542 658 55 65"));
        System.out.println(s21.receiveCall("Gachi") + s21.getNumber("+777 458 668 95 56"));
        System.out.println(s21.receiveCall("Steve", "+1 45 682 45 86"));

        System.out.println(iPhone.sendMessage("+777 458 668 95 56", "+777 468 668 95 56", "+777 988 668 95 56"));
    }

}
