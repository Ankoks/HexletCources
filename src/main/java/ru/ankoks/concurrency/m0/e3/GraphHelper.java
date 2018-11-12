package ru.ankoks.concurrency.m0.e3;

import ru.ankoks.concurrency.m0.e2.GraphNode;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class GraphHelper {

    public static void show(final GraphNode node, final int level) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level * 7; i++) {
            sb.append(".");
        }
        sb.append("  ");
        final String space = sb.toString();
        final String nodeStr = node.getNode().toString();
        final String updateNodeStr = nodeStr.replace("\n", "\n" + space);
        System.out.println("\n" + space + updateNodeStr);
        for (GraphNode child : node.getChildren()) {
            show(child, level + 1);
        }
    }

    public static int countNodex(final GraphNode node) {
        int count = 1;
        for (GraphNode child : node.getChildren()) {
            count += countNodex(child);
        }

        return count;
    }
}