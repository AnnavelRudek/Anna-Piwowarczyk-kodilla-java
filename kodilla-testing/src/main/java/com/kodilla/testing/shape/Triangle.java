package com.kodilla.testing.shape;

import java.util.Objects;

 class Triangle implements Shape {
    private String shapeName;
    private Integer field;

    public Triangle(String shapeName, Integer field) {
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
        Triangle triangle = (Triangle) o;
        return Objects.equals(shapeName, triangle.shapeName) &&
                Objects.equals(field, triangle.field);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Triangle{" +
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
