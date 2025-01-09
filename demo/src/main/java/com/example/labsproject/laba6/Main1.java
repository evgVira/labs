package com.example.labsproject.laba6;

public class Main1 {
    public static double divide(double a, double b) throws DivisionByZeroError {
        if (b == 0) {
            throw new DivisionByZeroError();
        }
        return a / b;
    }

    public static void allocateMemory(int size) throws MemoryError {
        if (size > 1000) {
            throw new MemoryError();
        }
        System.out.println("Память выделена для " + size + " элементов.");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Результат деления: " + divide(10, 0));
        } catch (DivisionByZeroError e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }

        try {
            allocateMemory(2000);
        } catch (MemoryError e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }

        try {
            allocateMemory(500);
        } catch (MemoryError e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }
    }
}

