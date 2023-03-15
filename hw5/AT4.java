package hw5;

/*
Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.
*/

import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        //int arraySize = 11;
        System.out.print("Enter array size:");
        int arraySize = num1.nextInt();
        //String answer = "No";
        float[] nums = new float[arraySize];
        //int a = arraySize /2 * -1 - 1;
        for(int i = 0; i < arraySize; i++){
            nums[i] = (float) Math.random() * 100;
            //a += 1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        float max = -1;
        float min = 1000;
        float sum =0;
        for (int i = 1; i < arraySize; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
            sum = sum + nums[i];
        }
        sum /= arraySize;
        System.out.println(max + ", " + min + ", " + sum);
    }
}
