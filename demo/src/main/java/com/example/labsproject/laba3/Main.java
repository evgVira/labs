package com.example.labsproject.laba3;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector(5);
        Vector v3 = new Vector(5, 2.5f);

        v1.print();
        v2.print();
        v3.print();

        Vector v4 = v2.add(10);
        v4.print();

        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.set(0, 0, 1);
        m1.set(0, 1, 2);
        m1.set(1, 0, 3);
        m1.set(1, 1, 4);

        m2.set(0, 0, 5);
        m2.set(0, 1, 6);
        m2.set(1, 0, 7);
        m2.set(1, 1, 8);

        m1.print();
        m2.print();

        Matrix m3 = m1.add(m2);
        m3.print();

        Matrix m4 = m1.multiply(m2);
        m4.print();
    }
}
