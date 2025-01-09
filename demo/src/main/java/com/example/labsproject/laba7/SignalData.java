package com.example.labsproject.laba7;

class SignalData extends Data {
    private String signal;

    public SignalData(String signal) {
        this.signal = signal;
    }

    @Override
    public void display() {
        System.out.println("Данные типа сигнал: " + signal);
    }

    @Override
    public void save() {
        System.out.println("Данные типа сигнал сохранены.");
    }

    @Override
    public void process() {
        System.out.println("Обработка данных типа сигнал...");
    }
}
