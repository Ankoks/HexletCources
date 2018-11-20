package ru.ankoks.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * User: ankoks
 * Date: 20.11.2018
 */
public class RandomSet {
    private Map<Integer, Object> map = new HashMap<>();

    private int startSize = 0;

    public void put(Object o) {
        map.put(startSize++, o);
    }

    public Object random() {
        int i = new Random().nextInt(map.size());
        System.out.println("new Random().nextInt(map.size()) = " + i);
        return map.get(i);
    }

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();

        RandomSet randomSet = new RandomSet();
        System.out.println(randomSet.map);
        randomSet.put(object1);
        randomSet.put(object2);
        randomSet.put(object3);
        randomSet.put(object4);
        System.out.println(randomSet.map);

        System.out.println(randomSet.random());
    }
}
