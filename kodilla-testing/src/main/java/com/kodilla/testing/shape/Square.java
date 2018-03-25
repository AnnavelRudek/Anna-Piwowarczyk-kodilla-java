package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String shapeName;
    private Integer field;

    public Square(String shapeName, Integer field) {
        this.field = field;
        this.shapeName = shapeName;
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
        Square square = (Square) o;
        return Objects.equals(shapeName, square.shapeName) &&
                Objects.equals(field, square.field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Square{" +
                "ShapeName='" + shapeName + '\'' +
                ", Field=" + field +
                '}';
    }

    @Override
    public void getShapeName(String shapeName) {

    }

    @Override
    public void getField(double field) {

    }
}
