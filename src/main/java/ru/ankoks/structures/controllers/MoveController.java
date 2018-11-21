package ru.ankoks.structures.controllers;


import ru.ankoks.structures.model.Field;
import ru.ankoks.structures.model.Figure;
import ru.ankoks.structures.model.Point;
import ru.ankoks.structures.model.exceptions.AlreadyOccupiedException;
import ru.ankoks.structures.model.exceptions.InvalidPointException;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
