package ru.ankoks.concurrency.m1.e0;

import ru.ankoks.concurrency.m0.e2.GraphNode;
import ru.ankoks.concurrency.m0.e2.XOField;

import java.util.HashSet;
import java.util.Set;

/**
 * User: ankoks
 * Date: 12.11.2018
 */
public class GraphBuilder {
    public GraphNode build(final XOField.Figure currentFigure, final XOField currentField) {
        final XOField.Figure nextFigure = currentFigure == XOField.Figure.O ? XOField.Figure.X : XOField.Figure.O;
        final Set<GraphNode> children = new HashSet<>();

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (currentField.getFigure(x, y) != null) {
                    continue;
                }
                final XOField newField = new XOField(currentField);
                newField.setFigure(x, y, nextFigure);
                children.add(build(nextFigure, newField));
            }
        }

        return new GraphNode(currentField, children);
    }
}
