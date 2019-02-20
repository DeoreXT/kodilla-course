package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes;

    public ShapeCollector() {
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

    public boolean removeFigure(int i) {
        shapes.remove(i);
        return true;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public boolean showFigures() {
        for (Shape s: shapes) {
            System.out.println(s.getShapeName() + ", field: " + s.getField());
        }
        return true;
    }
}
