package com.example.labsproject.laba7;

public class Main2 {
    public static void main(String[] args) {
        Data signal = new SignalData("Alarm");
        Data result = new ProcessingResult("Success");
        Data auxiliary = new AuxiliaryData("Sensor data");
        signal.display();
        signal.save();
        signal.process();

        result.display();
        result.save();
        result.process();

        auxiliary.display();
        auxiliary.save();
        auxiliary.process();
    }
}

