package com.kodilla.testing.shape;

import org.junit.*;
import java.lang.*;


public class ShapeCollectorTestSuite {
    private static int  testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is begining of Shape Collecotr tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test no. " + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape triangle = new Triangle("Triagnle",3);
        ShapeCollector shapeCollector = new ShapeCollector();
        System.out.println("#add figures");

        //When
        shapeCollector.addFigure(triangle);

        //Then
        Assert.assertEquals (triangle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape square = new Square("Square", 4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        System.out.println("#remove figures");

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertEquals(null, shapeCollector.getFigure(0));
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape triangle = new Triangle("Triangle", 3);
        Shape square = new Square("Square", 4);
        Shape circle = new Circle("Circle", 1);
        ShapeCollector shapeCollector = new ShapeCollector();
        String names = shapeCollector.showFigures();
        System.out.println("#show figures");

        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(" Triangle Square Circle", shapeCollector.showFigures());
    }

}