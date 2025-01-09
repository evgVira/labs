package com.example.labsproject.laba5;

class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void print() {
        System.out.println("Rectangle: length = " + side1 + ", width = " + side2);
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }
}
