package ru.ankoks.concurrency.m2.e1;

import ru.ankoks.concurrency.m0.e2.GraphNode;
import ru.ankoks.concurrency.m0.e2.XOField;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * User: ankoks
 * Date: 19.11.2018
 */
public class GraphBuilder implements Callable<GraphNode> {

    private final ExecutorService executorService;
    private final XOField.Figure nextFigure;
    private final XOField currentField;
    private final int deepLevel;

    public GraphBuilder(ExecutorService executorService, XOField.Figure nextFigure, XOField currentField, int deepLevel) {
        this.executorService = executorService;
        this.nextFigure = nextFigure;
        this.currentField = currentField;
        this.deepLevel = deepLevel;
    }


    @Override
    public GraphNode call() {
        final List<Future<GraphNode>> futures = new ArrayList<>();
        final Set<GraphNode> children = new CopyOnWriteArraySet<>();
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (currentField.getFigure(x, y) != null) {
                    continue;
                }

                final XOField newField = new XOField(currentField);
                newField.setFigure(x, y, nextFigure);
                final GraphBuilder graphBuilder
                        = new GraphBuilder(executorService, nextFigure, newField, deepLevel + 1);

                if (isAsync()) {
                    final Future<GraphNode> future
                            = executorService.submit(graphBuilder);
                    futures.add(future);
                } else {
                    children.add(graphBuilder.call());
                }
            }
        }

        if (!futures.isEmpty()) {
            for (Future<GraphNode> future : futures) {
                try {
                    children.add(future.get());
                } catch (final InterruptedException | ExecutionException e) {
                    throw new RuntimeException();
                }
            }
        }

        return new GraphNode(currentField, children);
    }

    private boolean isAsync() {
        return deepLevel <= 3;
    }
}
