package code.hw11.T1;

/*
Напишите метод, который на вход получает коллекцию объектов,
а возвращает коллекцию уже без дубликатов.
*/

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class T2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter collection size:");
        int arrayListSize = num1.nextInt();
        LinkedList<Integer> arrayLinked = new LinkedList<>();
        for (int i = 0; i < arrayListSize; i++) {
            arrayLinked.add(random.nextInt(5));
        }

        System.out.println(arrayLinked);

        Set <Integer> set = new LinkedHashSet<>(arrayLinked);
        LinkedList<Integer> arrayLinked2 = new LinkedList<>(set);

        System.out.println(arrayLinked2);

    }
}
