package com.example.labsproject.laba6;

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void print() {
        System.out.println("Square: side = " + side1);
    }

    @Override
    public double calculateArea() {
        return side1 * side1;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side1;
    }
}
