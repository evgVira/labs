package com.example.labsproject.laba7;

class ProcessingResult extends Data {
    private String result;

    public ProcessingResult(String result) {
        this.result = result;
    }

    @Override
    public void display() {
        System.out.println("Результат обработки: " + result);
    }

    @Override
    public void save() {
        System.out.println("Результат обработки сохранен.");
    }

    @Override
    public void process() {
        System.out.println("Обработка результата...");
    }
}
