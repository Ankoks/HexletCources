package ru.ankoks.e3;

/**
 * User: ankoks
 * Date: 07.11.2018
 */
public class Test<T1, T2, T3> extends Tuple3<T1, T2> {
    private final T1 left;
    private final T2 right;
    private final T3 middle;

    public Test(T1 left, T2 right, T1 left1, T2 right1, T3 middle) {
        super(left, right);
        this.left = left1;
        this.right = right1;
        this.middle = middle;
    }

    @Override
    public T1 getLeft() {
        return left;
    }

    @Override
    public T2 getRight() {
        return right;
    }

    public T3 getMiddle() {
        return middle;
    }
}
