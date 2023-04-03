package code.hw11.T1;

/*
Напишите метод, который заполняет рандомными значениями (1000000 раз) коллекции ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
Замерьте время, которое потрачено на это. Сравните результаты и сделайте выводы :)
(Время поможет замерить System.nanoseconds() метод)
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class T1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(random.nextInt(100));
        }
        for (int i = 0; i < 100000; i++) {
            arrayList2.add(arrayList.get(random.nextInt(999999)));
        }
        System.out.println(System.currentTimeMillis()-startTime);
        startTime = System.currentTimeMillis();

        LinkedList<Integer> arrayLinked = new LinkedList<>();
        LinkedList<Integer> arrayLinked2 = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayLinked.add(random.nextInt(100));
        }
        for (int i = 0; i < 100000; i++) {
            arrayLinked2.add(arrayLinked.get(random.nextInt(999999)));
        }
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
