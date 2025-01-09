package com.example.labsproject.laba4;

public class Main {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(5.0);
        Coordinate c2 = new Coordinate(3.0);
        c1.print();
        c2.print();
        Coordinate.increment(c1);
        c1.print();
        c1.add(c2);
        c1.print();
        c1.add(10.0);
        c1.print();
        Coordinate c3 = new Coordinate(0.0);
        c3.assign(c1);
        c3.print();


        QueueHandler q = new QueueHandler();
        q.add(10.5);
        q.add(20.5);
        q.add(30.5);
        q.print();
        double removed = QueueHandler.remove(q);
        System.out.println("Removed element: " + removed);
        q.print();
        q.addToFirst(5.0);
        q.print();
        q.multiplyFirst(2.0);
        q.print();
    }
}

