package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String ShapeName;
    private Integer Field;

    public Square(String shapeName, Integer field) {
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
        Square square = (Square) o;
        return Objects.equals(ShapeName, square.ShapeName) &&
                Objects.equals(Field, square.Field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ShapeName, Field);
    }

    @Override
    public String toString() {
        return "Square{" +
                "ShapeName='" + ShapeName + '\'' +
                ", Field=" + Field +
                '}';
    }
}
