package code.hw12.T2;

/*
Напишите методы union(Set<?>... set) и intersect(Set<?> ... set),
реализующих операции объединения и пересечения множеств соотвествующе.
*/

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class T2 {

    private static void printSet(String str, Set <Integer> set) {
        if (set.size() != 0) {
            System.out.print(str + " - { ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println("}");
        }
    }

    private static Set <Integer> union(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> unionSet = new TreeSet<>();
        unionSet.addAll(firstSet);
        unionSet.addAll(secondSet);
        return unionSet;
    }

    private static Set <Integer> intersaction(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> intersactionSet = new TreeSet <> ();
        for (Integer firstSetElement : firstSet) {
            for (Integer secondSetElement : secondSet) {
                if (Objects.equals(firstSetElement, secondSetElement)) {
                    intersactionSet.add(firstSetElement);
                }
            }
        }
        return intersactionSet;
    }

    public static void main(String[] args) {

            Set<Integer> firstSet = new TreeSet <> ();
            for (int i = 0; i < 10; i++) {
                firstSet.add(i + 1);
            }
            printSet("First set", firstSet);

            Set <Integer> secondSet = new TreeSet <> ();
            for (int i = 4; i < 15; i++) {
                secondSet.add(i + 1);
            }
            printSet("Second set", secondSet);

            printSet("Union set", union(firstSet, secondSet));
            printSet("Intersaction set", intersaction(firstSet, secondSet));

    }
}
