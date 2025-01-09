package com.example.labsproject.laba7;


class Pryamougolnik extends Figura {
    private double width;
    private double height;


    public Pryamougolnik(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        return width * height;
    }


    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void print() {
        System.out.println("Прямоугольник: ширина = " + width + ", высота = " + height);
        System.out.println("Площадь = " + area());
        System.out.println("Периметр = " + perimeter());
    }
}

