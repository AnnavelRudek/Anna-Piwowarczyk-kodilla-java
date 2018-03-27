package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName;
    private Integer field;

    public Circle(String shapeName, Integer field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Integer getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(shapeName, circle.shapeName) &&
                Objects.equals(field, circle.field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "ShapeName='" + shapeName + '\'' +
                ", Field=" + field +
                '}';
    }

    @Override
    public void getShapeName(String shapeName) {

    }

    @Override
    public void getField(int field) {

    }
}

