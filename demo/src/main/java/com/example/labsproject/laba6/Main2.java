package com.example.labsproject.laba6;

public class Main2 {
    public static void allocateMemory(int size) throws MemoryError {
        if (size > 1000) {
            throw new MemoryError();
        }
        System.out.println("Память выделена для " + size + " элементов.");
    }

    public static void openFile(String fileName) throws FileError {
        if (fileName == null || fileName.isEmpty()) {
            throw new FileError();
        }
        System.out.println("Файл " + fileName + " успешно открыт.");
    }

    public static void unexpectedOperation() throws UnexpectedError {
        throw new UnexpectedError();
    }

    public static void main(String[] args) {
        try {
            allocateMemory(2000);
        } catch (MemoryError e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }

        try {
            openFile("");
        } catch (FileError e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }

        try {
            unexpectedOperation();
        } catch (UnexpectedError e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }

        try {
            allocateMemory(500);
            openFile("data.txt");
            System.out.println("Программа завершена без ошибок.");
        } catch (Error e) {
            System.out.println("Общая ошибка: " + e.getMessage());
        }
    }
}
