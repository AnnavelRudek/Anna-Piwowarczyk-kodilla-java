package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String ShapeName;
    private Integer Field;

    public Triangle(String shapeName, Integer field) {
        this.Field = field;
        this.ShapeName = shapeName;
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
        Triangle triangle = (Triangle) o;
        return Objects.equals(ShapeName, triangle.ShapeName) &&
                Objects.equals(Field, triangle.Field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ShapeName, Field);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "ShapeName='" + ShapeName + '\'' +
                ", Field=" + Field +
                '}';
    }
}
