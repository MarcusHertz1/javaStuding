package code.hw4;

/* Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».*/

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter temperature:");
        int a = num1.nextInt();
        if (a > -5){
            System.out.println("Warm");
        } else if (a > -20){
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

}
