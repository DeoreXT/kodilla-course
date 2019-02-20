package com.kodilla.testing.shape;

public class Square implements Shape {
    int sideA;

    public void Square(int sideA) {
        super();
        this.sideA = sideA;
    }
@Override
    public String getShapeName()
    {
        return "Square";
    };
@Override
    public double getField()
    {
        return sideA*sideA;
    };
}
