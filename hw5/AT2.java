package hw5;

/*
Напишите программу, которая выводит на консоль таблицу умножения.
*/

public class AT2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {

            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("----------");
        }
    }
}
