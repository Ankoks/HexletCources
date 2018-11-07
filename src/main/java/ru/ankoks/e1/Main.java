package ru.ankoks.e1;

/**
 * User: ankoks
 * Date: 06.11.2018
 */
public class Main {

    public static void main(String[] args) {
        StringTuple st = new StringTuple("left", "right");

        final Tuple<String> st2 = new Tuple<>("1", "2");

        System.out.println(st2.getLeft() + 15);

        Tuple<Integer> it = new Tuple<>(1, 2);

        System.out.println(it.getLeft() + 15);

        Tuple<SuperClass> superClassTuple = new Tuple<>(new SuperClass(), new SuperClass());

        System.out.println(superClassTuple.getLeft());
    }

    private static class SuperClass{
        @Override
        public String toString() {
            return "super";
        }
    }
}
