package com.kodilla.testing.shape;

public class Square implements Shape {
    int sideA;

    public void Square(int sideA) {
        this.sideA = sideA;
    }

    public String getShapeName()
    {
        return "Square";
    };

    public double getField()
    {
        return sideA*sideA;
    };
}
