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
        Shape triangle = new Triangle("Triagnle", (int) 3.0);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        ShapeCollector.add(triangle);

        //Then
        Assert.assertEquals(1, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape square = new Square("Square", 4.0);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigure(0));
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

