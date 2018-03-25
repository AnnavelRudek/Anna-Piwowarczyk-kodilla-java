package com.kodilla.testing.shape;

import java.awt.*;
import java.util.ArrayList;
import java.lang.*;



public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figureShapes = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        figureShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        figureShapes.remove(shape);
    }


    public void getFigure(Shape shape) {
        figureShapes.set();
        System.out.println("Element of the list is: " + figureShapes);
    }

    public void showFigures(String shape) {
       figureShapes.get();
   }

}
    // pobierającą z kolekcji figurę z pozycji n listy.

    // showFigures najlepiej jakby zwracała String lub Lis wtedy będzie ją najłatwiej przetestować




