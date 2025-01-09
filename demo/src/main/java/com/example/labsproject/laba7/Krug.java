package com.example.labsproject.laba7;

class Krug extends Figura {
    private double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("Круг: радиус = " + radius);
        System.out.println("Площадь = " + area());
        System.out.println("Периметр = " + perimeter());
    }
}
