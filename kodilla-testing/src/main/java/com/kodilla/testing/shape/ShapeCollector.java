package com.kodilla.testing.shape;

import java.awt.*;
import java.util.ArrayList;

// Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich
//nazw klas).


public class ShapeCollector implements Shape {

    private Shape shape;
    private ArrayList<Shape> figureShapes = new ArrayList<>();
    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }


    public void addFigure(Shape shape){
        figureShapes.add(shape);
    }

    public void removeFigure(Shape shape){
        figureShapes.remove(shape);
    }

    public void getFigure(int n){
        figureShapes.get(n);
        System.out.println("Element of the list is: " + figureShapes);
    }

    public void showFigures(){} // pobierającą z kolekcji figurę z pozycji n listy.

    @Override
    public void getShapeName(String shapeName) {

    }

    @Override
    public void getField(double field) {

    }
}


