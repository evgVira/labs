package com.example.labsproject.laba5;

public class Main {
    public static void main(String[] args) {
        Quadrilateral quad = new Quadrilateral(4, 5);
        quad.print();
        System.out.println("Area: " + quad.calculateArea());
        System.out.println("Perimeter: " + quad.calculatePerimeter());

        Rectangle rect = new Rectangle(4, 5);
        rect.print();
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        Square sq = new Square(4);
        sq.print();
        System.out.println("Area: " + sq.calculateArea());
        System.out.println("Perimeter: " + sq.calculatePerimeter());
    }
}
