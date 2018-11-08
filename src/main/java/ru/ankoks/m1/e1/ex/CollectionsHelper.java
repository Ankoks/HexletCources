package ru.ankoks.m1.e1.ex;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class CollectionsHelper<T extends Human> {


    public T findFirst(final List<T> humans, final String namePrefix, final Sex sex) {
        // BEGIN (write your solution here)
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().startsWith(namePrefix) && humans.get(i).getSex().equals(sex)) {
                return humans.get(i);
            }
        }

        return null;
        // END
    }

    public static void main(String[] args) {
        List<Human> mans = new ArrayList<Human>() {
            {
                add(new Man("Slava"));
                add(new Man("Klod"));
                add(new Woman("Klara"));
                add(new Woman("Tamara"));
                add(new Intersex("Borodachka"));
            }
        };


        CollectionsHelper<Human> collectionsHelper = new CollectionsHelper<>();

        System.out.println(collectionsHelper.findFirst(mans, "Kl", Sex.F).getName());
    }
}
