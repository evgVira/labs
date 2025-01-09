package com.example.labsproject.laba7;

public class Main1 {
    public static void main(String[] args) {
        Figura krug = new Krug(5);
        Figura pryamougolnik = new Pryamougolnik(4, 6);
        Figura trapezia = new Trapezia(3, 5, 4);
        krug.print();
        pryamougolnik.print();
        trapezia.print();
    }
}
