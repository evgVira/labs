package com.example.labsproject.laba4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueHandler {
    private Queue<Double> queue;

    public QueueHandler() {
        this.queue = new LinkedList<>();
    }

    public static double remove(QueueHandler q) {
        if (!q.queue.isEmpty()) {
            return q.queue.poll();
        }
        throw new IllegalStateException("Queue is empty.");
    }

    public void add(double number) {
        queue.add(number);
    }

    public void addToFirst(double number) {
        if (!queue.isEmpty()) {
            double firstElement = queue.poll();
            queue.add(firstElement + number);
        }
    }

    public void multiplyFirst(double number) {
        if (!queue.isEmpty()) {
            double firstElement = queue.poll();
            queue.add(firstElement * number);
        }
    }

    public void print() {
        System.out.println("Queue contents: " + queue);
    }
}
