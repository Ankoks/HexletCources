package ru.ankoks.concurrency.m2.e2;

import ru.ankoks.concurrency.m0.e2.GraphNode;
import ru.ankoks.concurrency.m0.e2.XOField;

import java.util.concurrent.RecursiveTask;

/**
 * User: ankoks
 * Date: 20.11.2018
 */
public class GraphBuilder extends RecursiveTask<GraphNode> {
    private final XOField.Figure nextFigure;
    private final XOField currentField;
    private final int deepLevel;

    public GraphBuilder(XOField.Figure nextFigure, XOField currentField, int deepLevel) {
        this.nextFigure = nextFigure;
        this.currentField = currentField;
        this.deepLevel = deepLevel;
    }

    @Override
    protected GraphNode compute() {
        return null;
    }
}
