package code.hw8.T1;

/*
Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета периметра для каждого типа фигуры. Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
*/

public class T1 {
    public static void main(String[] args) {

        T1Figure[] figures = {
                new T1Triangle(5, 6, 10),
                new T1Rectangle(5, 6),
                new T1Circle(9),
                new T1Rectangle(8, 7),
                new T1Triangle(5, 9, 3)
        };

        int sumPer = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Per " + i + " = :" + figures[i].perimeter());
            sumPer += figures[i].perimeter();
            System.out.println("Square " + i + " = :" + figures[i].calculateSquare());
        }

        System.out.println("Sum: " + sumPer);
    }
}
