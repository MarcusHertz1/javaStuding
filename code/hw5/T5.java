package code.hw5;

/*
Вывести 10 первых чисел последовательности 0, -5,-10,-15
*/

public class T5 {
    public static void main(String[] args) {
        int i = 0, a = 5;
        while(i != 10){
            ++i;
            a -= 5;
            System.out.print(a + " ");
        }
    }
}