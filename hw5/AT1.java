package hw5;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
(Для вычисления суммы с учетом процентов используйте цикл for.
Пусть сумма вклада будет представлять тип float.)
*/

import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the deposit amount:");
        float a = num1.nextFloat();
        System.out.print("Enter the number of months:");
        int b = num1.nextInt();
        for(int i = 0;i < b; i++) {
            a *= 1.07;
            System.out.print(a + " ");
        }
    }

}
