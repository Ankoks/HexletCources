package ru.ankoks.concurrency.m1.e0;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class CollectionsHelper {

    public static int findIndex(final List list, final Object target) {
        // BEGIN (write your solution here)
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }

        return -1;
        // END
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        list.add(765);
        list.add(0);

        System.out.println(findIndex(list, 765));
    }
}
