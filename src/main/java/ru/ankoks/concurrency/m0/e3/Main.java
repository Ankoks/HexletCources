package ru.ankoks.concurrency.m0.e3;

import ru.ankoks.concurrency.m0.e2.GraphNode;
import ru.ankoks.concurrency.m0.e2.XOField;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class Main {
    public static void main(String[] args) {
        final GraphNode root = new GraphBuilder().build(XOField.Figure.X, new XOField());
        System.out.println(root.getNode());
        GraphHelper.show(root, 0);
        System.out.println(GraphHelper.countNodex(root));
    }
}
