package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes;

    public void ShapeCollector() {
        this.shapes = new ArrayList<Shape>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shapes.equals(that.shapes);
    }

    @Override
    public int hashCode() {
        return shapes.hashCode();
    }

    public void addFigure(Shape shape) {

        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return false;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public ArrayList<Shape> showFigures() {
        return shapes;
    }
}
