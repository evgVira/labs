package com.example.labsproject.laba1;

import java.io.PrintStream;
import java.util.Formatter;

public class LabFirst {

    public static void printMessage(PrintStream out, String message) {
        out.println("*** " + message + " ***");
    }

    public static String formatHex(int number) {
        return String.format("%#010x", number);
    }

    public static void main(String[] args) {
        System.out.println("Номер$$$Символ$$$$Шестн.$$$Восьм.$$$");
        int i = 1;
        char symbol = 'a';
        while (symbol <= 'z') {
            System.out.printf("%1$-10d%2$-10c%3$#10x%4$#10o\n".replace(' ', '$'),
                    i, symbol, (int) symbol, (int) symbol);
            i++;
            symbol++;
        }

        Formatter formatter = new Formatter();
        boolean isBaseOutput = true;
        boolean isPlusBeforeNumber = true;

        printMessage(System.out, "До изменения флагов");
        formatter.format("Основание системы: %b, Плюс перед числом: %b\n", isBaseOutput, isPlusBeforeNumber);
        System.out.println(formatter);

        isBaseOutput = !isBaseOutput;
        isPlusBeforeNumber = !isPlusBeforeNumber;

        printMessage(System.out, "После изменения флагов");
        formatter = new Formatter();
        formatter.format("Основание системы: %b, Плюс перед числом: %b\n", isBaseOutput, isPlusBeforeNumber);
        System.out.println(formatter);

        printMessage(System.out, "Тест манипуляторов");
        System.out.println("Число в шестнадцатеричном формате с точностью 10:");
        System.out.println(formatHex(255));
    }
}
