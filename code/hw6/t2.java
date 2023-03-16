package code.hw6;

/*
Дан массив, состоящий из целых чисел.
Напишите программу, которая подсчитает количество элементов массива,
больших предыдущего (элемента с предыдущим номером).

  Примеры
  входные данные
  5
  1 2 3 4 5

  выходные данные
  4
*/

import java.util.Arrays;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter array size:");
        int arraySize = num1.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int i = 1; i < arraySize; i++) {
            if (nums[i] > nums[i - 1]) {
                ++sum;
            }
        }
        System.out.print("Sum: " + sum);
    }
}
