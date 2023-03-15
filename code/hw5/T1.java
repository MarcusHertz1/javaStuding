package code.hw5;

/*
При помощи цикла for вывести на экран нечетные числа от 1 до 99.
(При решении используйте операцию инкремента (++)).
*/

public class T1 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}