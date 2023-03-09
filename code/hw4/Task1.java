package code.hw4;

import java.util.Scanner;

/*
На вход программе даётся два целых числа (a и b).
Нужно вывести результат деление первого на второе и остаток
от деления первого на второе.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = num1.nextInt();
        System.out.println("Enter number b:");
        int b = num1.nextInt();
        int div = a / b;
        int remOfDiv = a % b;
        System.out.println("Divides a by b: " + div);
        System.out.println("Remainder of dividing a by b: " + remOfDiv);
    }
}
