package code.hw12.T1;

/*
Напишите метод, который получает на вход Map<K, V> и возвращает Map,
где ключи и значения поменяны местами. Так как значения могут совпадать,
то тип значения в Map будет уже не K, а Collection<K> (Map<V, Collection<K>>)
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T1 {

   /* public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<K> keys = map.keySet();
        for(K key : keys){
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if(ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }

        return resultMap;
    }

    public static void main(String[] args) {

    }*/
}
