package hw5;

/*
Напишите программу, где пользователь вводит любое целоеположительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
(Для ввода числа воспользуйтесь классом Scanner.)
*/

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter any number >1:");
        int a = num1.nextInt();
        for(int i = 1;i <= a; i++) {
            System.out.print(i + " ");

        }
    }
}