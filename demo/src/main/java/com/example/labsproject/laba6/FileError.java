package com.example.labsproject.laba6;

class FileError extends Error {
    public FileError() {
        super("Ошибка с файлом: файл не найден или поврежден");
    }
}
