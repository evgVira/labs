package com.example.labsproject.laba7;

class Trapezia extends Figura {
    private double a, b, h;

    public Trapezia(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }


    @Override
    public double area() {
        return (a + b) * h / 2;
    }

    @Override
    public double perimeter() {
        double side = Math.sqrt(Math.pow((b - a) / 2, 2) + Math.pow(h, 2));
        return a + b + 2 * side;
    }

    @Override
    public void print() {
        System.out.println("Трапеция: основания = " + a + " и " + b + ", высота = " + h);
        System.out.println("Площадь = " + area());
        System.out.println("Периметр = " + perimeter());
    }
}

