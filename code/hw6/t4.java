package code.hw6;

/*
Напишите программу, которая циклически сдвигает элементы массива вправо
(например, если элементы нумеруются, начиная с нуля,
то 0-й элемент становится 1-м, 1-й становится 2-м, ...,
последний становится 0-м, то есть массив {3, 5, 7, 9} превращается в массив {9, 3, 5, 7}).

  Примеры
  входные данные
  6
  4 5 3 4 2 3
  выходные данные
  3 4 5 3 4 2
*/

import java.util.Arrays;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter array size:");
        int arraySize = num1.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(nums));
        int a;
        /*for (int i = 0; i < arraySize-1; i++) {
            a = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = a;
        }
        System.out.println(Arrays.toString(nums));*/
        for (int i = arraySize-1; i > 0; i--) {
            a = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = a;
        }
        System.out.println(Arrays.toString(nums));
    }
}
