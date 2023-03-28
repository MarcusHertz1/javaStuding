package code.hw8.T2;

/*
Написать абстрактный класс Employee.
От него унаследовать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название должности и
имплементировать этот метод в созданные классы.
*/

public class T2 {
    public static void main(String[] args) {
        Employee[] positions = {
                new Director(),
                new Worker(),
                new Accountant()
        };

        for (int i = 0; i < 3; i++) {
            System.out.println("Position " + (i + 1) + " = : " + positions[i].printNamePosition());
        }
    }
}
