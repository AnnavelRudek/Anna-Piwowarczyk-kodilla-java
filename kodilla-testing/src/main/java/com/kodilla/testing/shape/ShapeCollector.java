package com.kodilla.testing.shape;

import java.awt.*;
import java.util.ArrayList;
import java.lang.*;



public class ShapeCollector {

    private ArrayList<Shape> figureShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figureShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        figureShapes.remove(shape);
    }

    public Shape getFigure(int index) {
        System.out.println("Element of the list is: " + figureShapes);
        if (index < figureShapes.size()) {
            return figureShapes.get(index);
        }
        return null;
    }

   public String showFigures() {
        String names = "";
        for (Shape s: figureShapes){
            names = names + " " + s.getShapeName();
        }
       return names;
   }

}
    // pobierającą z kolekcji figurę z pozycji n listy.

    // showFigures najlepiej jakby zwracała String lub Lis wtedy będzie ją najłatwiej przetestować




