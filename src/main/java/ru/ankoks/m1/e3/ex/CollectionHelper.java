package ru.ankoks.m1.e3.ex;

import java.util.List;

/**
 * User: ankoks
 * Date: 08.11.2018
 */
public class CollectionHelper {

    public static <T>int findFirstIndex(final List<T> list, final T target) {
        for (int i = 0; i < list.size(); i++) {
            final T element = list.get(i);
            if (element.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static <T>int findLastIndex(final List<T> list, final T target) {
        for (int i = (list.size()-1); i > 0; i--) {
            final T element = list.get(i);
            if (element.equals(target)) {
                return i;
            }
        }
        return -1;
    }
}