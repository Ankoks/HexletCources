package ru.ankoks.generics.m1.e4.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 09.11.2018
 */
public class CollectionHelper {
    // findFirstIndex

    public int findFirstIndex(final List<? extends Human> humans, String namePrefix) {
        // BEGIN (write your solution here)
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().startsWith(namePrefix)) {
                return i;
            }
        }

        return -1;
        // END
    }

    public static void main(String[] args) {
        //"Слава", "Максим", "Глеб", "Слава"
        List<Human> humans = new ArrayList<Human>() {
            {
                add(new Man("Слава"));
                add(new Man("Максим"));
                add(new Man("Глеб"));
                add(new Man("Слава"));
            }
        };

        CollectionHelper helper = new CollectionHelper();
        System.out.println(helper.findFirstIndex(humans, "Сла"));

    }
}
