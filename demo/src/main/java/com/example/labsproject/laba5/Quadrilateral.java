package com.example.labsproject.laba5;

public class Quadrilateral {
    protected double side1;
    protected double side2;

    public Quadrilateral(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void destroy() {
        System.out.println("Destroying Quadrilateral");
    }

    public double calculateArea() {
        return side1 * side2;
    }

    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    public void print() {
        System.out.println("Quadrilateral: side1 = " + side1 + ", side2 = " + side2);
    }
}

