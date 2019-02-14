package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
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
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> al = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = one.exterminate(al);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(al, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(7);
        al.add(14);
        al.add(21);
        //When
        ArrayList<Integer> result = one.exterminate(al);
        System.out.println("Testing " + result);
        //Then
        Assert.assertNotEquals(al, result);
    }
}
