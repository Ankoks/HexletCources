package ru.ankoks.concurrency.m1.e2;

import ru.ankoks.concurrency.m0.e2.GraphNode;
import ru.ankoks.concurrency.m0.e2.XOField;
import ru.ankoks.concurrency.m0.e3.GraphHelper;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {

    public static void main(String[] args) {
        final long before = System.currentTimeMillis();
        final GraphNode root = new GraphBuilder().build(XOField.Figure.X, new XOField(), 0);
        System.out.println(root.getNode());
        System.out.println(GraphHelper.countNodex(root));
        final long after = System.currentTimeMillis();

        System.out.printf("Time delta: %d", (after - before));
    }
}
