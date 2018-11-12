package ru.ankoks.concurrency.m0.e2;

import java.util.Set;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class GraphNode {
    private final XOField node;

    private final Set<GraphNode> children;


    public GraphNode(XOField node, Set<GraphNode> children) {
        this.node = node;
        this.children = children;
    }

    public XOField getNode() {
        return node;
    }

    public Set<GraphNode> getChildren() {
        return children;
    }
}
