package code.hw7;

/*
Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив Char'ов 8х8. С помощью циклов задать
элементам циклам значения B(Black) или W(White). Результат работы
программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
*/

import java.util.Arrays;
//import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        //Scanner num1 = new Scanner(System.in);
        int arraySize = 8;
        char[][] nums = new char[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if ((i + j) % 2 == 0) {
                    nums[i][j] = 'W';
                } else {
                    nums[i][j] = 'B';
                }
            }
        }
        for (char[] ints : nums) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
