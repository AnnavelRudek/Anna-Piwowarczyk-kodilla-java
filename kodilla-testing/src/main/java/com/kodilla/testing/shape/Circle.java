package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String ShapeName;
    private Integer Field;

    public Circle(String shapeName, Integer field) {
        this.ShapeName = shapeName;
        this.Field = field;
    }

    public String getShapeName() {
        return ShapeName;
    }

    public Integer getField() {
        return Field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(ShapeName, circle.ShapeName) &&
                Objects.equals(Field, circle.Field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ShapeName, Field);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "ShapeName='" + ShapeName + '\'' +
                ", Field=" + Field +
                '}';
    }
}

