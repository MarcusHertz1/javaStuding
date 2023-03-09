package code.hw4;

import java.util.Scanner;

/*Написать программу для вывода названия поры года по номеру
месяца. (При решении используйте оператор switch-case.)*/

public class T2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter number of month:");
        short a = num1.nextShort();
        switch (a) {
            case 1:
                System.out.println("Name of month: January");
                break;
            case 2:
                System.out.println("Name of month: February");
                break;
            case 3:
                System.out.println("Name of month: March");
                break;
            case 4:
                System.out.println("Name of month: April");
                break;
            case 5:
                System.out.println("Name of month: May");
                break;
            case 6:
                System.out.println("Name of month: June");
                break;
            case 7:
                System.out.println("Name of month: July");
                break;
            case 8:
                System.out.println("Name of month: August");
                break;
            case 9:
                System.out.println("Name of month: September");
                break;
            case 10:
                System.out.println("Name of month: October");
                break;
            case 11:
                System.out.println("Name of month: November");
                break;
            case 12:
                System.out.println("Name of month: December");
                break;
            default:
                System.out.println("Name of month: ERROR");
        }

    }

}
