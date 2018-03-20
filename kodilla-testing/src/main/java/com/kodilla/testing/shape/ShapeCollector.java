package com.kodilla.testing.shape;

import java.awt.*;
import java.util.ArrayList;

// Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich
//nazw klas).


public class ShapeCollector implements Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){}

    public void removeFigure(Shape shape){}

    public void getFigure(int n){}

    public void showFigures(){} //trzecią pobierającą z kolekcji figurę z pozycji n listy.
}
