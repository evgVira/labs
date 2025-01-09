package com.example.labsproject.laba4;

public class Coordinate {
    private double value;

    public Coordinate(double value) {
        this.value = value;
    }

    public static Coordinate increment(Coordinate c) {
        c.value++;
        return c;
    }

    public Coordinate add(Coordinate other) {
        this.value += other.value;
        return this;
    }

    public Coordinate add(double number) {
        this.value += number;
        return this;
    }

    public Coordinate assign(Coordinate other) {
        this.value = other.value;
        return this;
    }

    public double getValue() {
        return this.value;
    }

    public void print() {
        System.out.println("Coordinate: " + this.value);
    }

    public Coordinate increment() {
        this.value++;
        return this;
    }
}

