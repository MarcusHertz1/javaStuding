package code.hw6;

/*
Напишите программу, которая переставляет соседние элементы массива
(1-й элемент поменять с 2-м, 3-й с 4-м и т.д.
Если элементов нечетное число, то последний элемент остается на своем месте).

  Примеры
  входные данные
  6
  4 5 3 4 2 3

  выходные данные
  5 4 4 3 3 2

*/

import java.util.Arrays;
import java.util.Scanner;

public class t3 {
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
        for (int i = 1; i < arraySize; i += 2) {
            a = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = a;
        }
        System.out.println(Arrays.toString(nums));
    }
}
