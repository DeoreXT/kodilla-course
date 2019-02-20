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
        Class expected = sc.getClass();
        Class result = sc.getFigure(0).getClass();
        //Then
        Assert.assertTrue(result.getName() == result.getName());
        Assert.assertEquals(expected.getName(), result.getName());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square s = new Square(7);
        sc.addFigure(s);
        //When
        boolean result = sc.removeFigure(s);
        ArrayList<Shape> shape = sc.showFigures();
        //Then
        Assert.assertEquals(0, shape.size());
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
        Assert.assertNotNull(result);
        Assert.assertSame(s, result);
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
        ArrayList<Shape> result = sc.showFigures();
        //Then
        Assert.assertEquals(sc, result);
    }
}
