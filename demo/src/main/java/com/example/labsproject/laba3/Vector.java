package com.example.labsproject.laba3;

public class Vector {
    private float[] data;
    private int size;
    private int state;
    private static int objectCount = 0;

    public Vector() {
        this.size = 1;
        this.state = 0;
        this.data = new float[this.size];
        this.data[0] = 0;
        objectCount++;
    }

    public Vector(int size) {
        this.size = size;
        this.state = 0;
        this.data = new float[this.size];
        for (int i = 0; i < this.size; i++) {
            this.data[i] = i;
        }
        objectCount++;
    }

    public Vector(int size, float value) {
        this.size = size;
        this.state = 0;
        this.data = new float[this.size];
        for (int i = 0; i < this.size; i++) {
            this.data[i] = value;
        }
        objectCount++;
    }

    public void set(int index, float value) {
        if (index < 0 || index >= size) {
            this.state = 2;
        } else {
            this.data[index] = value;
            this.state = 0;
        }
    }

    public float get(int index) {
        if (index < 0 || index >= size) {
            this.state = 2;
            return 0;
        }
        return this.data[index];
    }

    public void print() {
        if (state != 0) {
            System.out.println("Ошибка состояния: " + state);
            return;
        }
        for (float value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public Vector add(float value) {
        Vector result = new Vector(size);
        for (int i = 0; i < size; i++) {
            result.data[i] = this.data[i] + value;
        }
        return result;
    }

    public Vector subtract(float value) {
        Vector result = new Vector(size);
        for (int i = 0; i < size; i++) {
            result.data[i] = this.data[i] - value;
        }
        return result;
    }

    public Vector multiply(float value) {
        Vector result = new Vector(size);
        for (int i = 0; i < size; i++) {
            result.data[i] = this.data[i] * value;
        }
        return result;
    }

    public boolean equals(Vector other) {
        if (this.size != other.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.data[i] != other.data[i]) {
                return false;
            }
        }
        return true;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}


