package code.hw6;

/*
Написать (и попытаться разобраться как работает, в том числе через дебаг)
простой алгоритм сортировки массива (пузырьком, сортировка выбором, вставками) на выбор
*/

import java.util.Arrays;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter array size:");
        int arraySize = num1.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(nums));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arraySize; i++) {
                if (nums[i - 1] > nums[i]){
                    int saveNum = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = saveNum;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
