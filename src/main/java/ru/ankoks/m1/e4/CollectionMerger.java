package ru.ankoks.m1.e4;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ankoks
 * Date: 09.11.2018
 */
public class CollectionMerger {

    public static <T, L extends T, R extends T> List<T> merge(final List<L> left, final  List<R> right) {
        final List<T> result = new ArrayList<>();

        result.addAll(left);
        result.addAll(right);

        return result;
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>(){
            {
                add(new Dog());
                add(new Dog());
            }
        };
        List<Cat> cats = new ArrayList<Cat>(){
            {
                add(new Cat());
                add(new Cat());
                add(new Cat());
            }
        };

        List<Animal> animals = CollectionMerger.merge(dogs, cats);

        System.out.println(animals);
    }

}
