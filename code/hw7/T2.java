package code.hw7;

/*
Дано число n, n <= 100 . Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из левого верхнего в правый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.
4
1 0 0 0
2 1 0 0
2 2 1 0
2 2 2 1
*/

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter array size <= 100:");
        int arraySize = num1.nextInt();
        if((arraySize>100)||(arraySize<=0)){
            System.out.print("ERROR");
            System.exit(0);
        }
        char[][] nums = new char[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (i== j) {
                    nums[i][j] = '1';
                } else if (j<i){
                    nums[i][j] = '2';
                } else {
                    nums[i][j] = '0';
                }
            }
        }
        for (char[] ints : nums) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
