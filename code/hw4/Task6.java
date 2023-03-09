package code.hw4;

import java.util.Scanner;

/*Решить квадратное уравнение для всех случаев дискриминанта*/

public class Task6 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("a*x^2+b*x+c=0");
        System.out.print("Enter a:");
        int a = num1.nextInt();
        System.out.print("Enter b:");
        int b = num1.nextInt();
        System.out.print("Enter c:");
        int c = num1.nextInt();
        int d = b*b-4*a*c;
        System.out.println("Discriminant: " + d);
        if (d < 0) {
            System.out.println("No root");
        } else if (d == 0) {
            double x = -1*(b/(2*a));
            System.out.println("Root x: " + x);
        } else {
            double x1 = ((-1 * b + Math.sqrt(d))/(2*a));
            double x2 = ((-1 * b - Math.sqrt(d))/(2*a));
            System.out.println("Root x1: " + x1);
            System.out.println("Root x2: " + x2);
        }
    }
}