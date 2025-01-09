package com.example.labsproject.laba2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile1 = "output_copy1.txt";
        String outputFile2 = "output_copy2.txt";

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos1 = new FileOutputStream(outputFile1);
             FileOutputStream fos2 = new FileOutputStream(outputFile2)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos1.write(buffer, 0, bytesRead);
                fos2.write(buffer, 0, bytesRead);
            }

            System.out.println("Файл успешно скопирован в два экземпляра.");
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
