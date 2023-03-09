package code.hw4;

/*Написать программу для вывода названия поры года по номеру
        месяца. (При решении используйте оператор if-else-if.)*/

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter number of month:");
        short a = num1.nextShort();
        if (a==12 || a<=2){
            System.out.println("Name time of the year: winter");
        } else if (a<=5) {
            System.out.println("Name time of the year: spring");
        } else if (a<=8) {
            System.out.println("Name time of the year: summer");
        } else if (a<=11) {
            System.out.println("Name time of the year: autumn");
        } else {
            System.out.println("Name time of the year: ERROR");
        }

    }

}
