package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

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
        Shape triangle = new Triangle("Triagnle", 3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> figureShapes = new ArrayList<>();

        //When
        figureShapes.add(triangle);

        //Then
        Assert.assertEquals(1, figureShapes.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape square = new Square("Square", 4.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> figureShapes = new ArrayList<>();

        //When
        figureShapes.remove(square);
        //Then
        Assert.assertEquals(1, figureShapes.getFfigure());
    }

    @Test
    public void testGetFigure(){
        //Given
        //When
        //Then
    }

    @Test
    public void testShowFigures(){
        //Given
        //When
        //Then
    }



}

