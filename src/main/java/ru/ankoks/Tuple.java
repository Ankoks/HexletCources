package ru.ankoks;

/**
 * User: ankoks
 * Date: 06.11.2018
 */

/**
 * Пара ключ-значения. Простой иммьютабл объект
 * Проблемы:
 */
public class Tuple {
    private final Object left;

    private final Object right;

    public Tuple(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public Object getLeft() {
        return left;
    }

    public Object getRight() {
        return right;
    }
}
