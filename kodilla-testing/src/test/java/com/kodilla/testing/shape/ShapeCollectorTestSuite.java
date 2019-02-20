package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square s = new Square(7);
        //When
        sc.addFigure(s);
        Class expected = s.getClass();
        Class result = sc.getFigure(0).getClass();
        //Then
        Assert.assertTrue(expected.equals(result));
        //Assert.assertEquals(expected.getName(), result.getName());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square s = new Square(7);
        sc.addFigure(s);
        //When
        boolean result = sc.removeFigure(0);
        //Then
        Assert.assertTrue(result);

    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square s = new Square(7);
        sc.addFigure(s);
        //When
        Square result = (Square)sc.getFigure(0);
        //Then
        Assert.assertTrue(result.equals(s));
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square s = new Square(7);
        Triangle t = new Triangle(1,2,3);
        Circle c = new Circle(7);
        sc.addFigure(s);
        sc.addFigure(t);
        sc.addFigure(c);
        //When
        boolean result = sc.showFigures();
        //Then
        Assert.assertTrue(result);
    }
}
