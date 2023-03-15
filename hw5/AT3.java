package hw5;

/*
Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
*/

import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int arraySize = 11;
        String answer = "No";
        int[] nums = new int[arraySize];
        int a = arraySize /2 * -1 - 1;
        for(int i = 0; i < arraySize; i++){
            nums[i] = a;
            a += 1;
            //System.out.print(a + " ");
        }
        System.out.print("Enter number:");
        int num = num1.nextInt();
        for(int i = 0; i < arraySize; i++){
            if (num == nums[i]) {
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}
