package com.example.labsproject.laba2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountPrintableCharacters {
    public static void main(String[] args) {
        String inputFile = "input.txt";

        try (FileReader fr = new FileReader(inputFile)) {
            int count = 0;
            int character;

            while ((character = fr.read()) != -1) {
                if (character >= 32 && character <= 126) {
                    count++;
                }
            }

            System.out.println("Количество печатаемых символов: " + count);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
