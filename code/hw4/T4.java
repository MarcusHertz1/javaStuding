package code.hw4;

/*Напишите программу, которая будет принимать на вход число и на
        выход будет выводить сообщение четное число или нет.
        (Для определения четности числа используйте операцию
        получения остатка от деления - операция выглядит так: '% 2').*/

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = num1.nextInt();
        if (a%2 == 0){
            System.out.println("Number a is even number");
        } else {
            System.out.println("Number a is odd number");
        }
    }

}
