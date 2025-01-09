package com.example.labsproject.laba7;

class AuxiliaryData extends Data {
    private String auxiliaryInfo;

    public AuxiliaryData(String auxiliaryInfo) {
        this.auxiliaryInfo = auxiliaryInfo;
    }

    @Override
    public void display() {
        System.out.println("Вспомогательные данные: " + auxiliaryInfo);
    }

    @Override
    public void save() {
        System.out.println("Вспомогательные данные сохранены.");
    }

    @Override
    public void process() {
        System.out.println("Обработка вспомогательных данных...");
    }
}

