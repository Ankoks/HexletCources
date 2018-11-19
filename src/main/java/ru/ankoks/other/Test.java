package ru.ankoks.other;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class Test {
    {
        System.out.println("Empty block");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Test test = new Test() {{
            System.out.println("Other");
        }};
    }
}
