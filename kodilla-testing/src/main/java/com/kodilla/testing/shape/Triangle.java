package com.kodilla.testing.shape;

import java.math.*;

public class Triangle implements Shape{
    private int sideA;
    private int sideB;
    private int sideC;

    public void Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        int p = sideA + sideB + sideC;
        double result = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideB));
        return result;
    }
}
