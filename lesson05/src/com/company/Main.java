package com.company;

public class Main {

    public static void main(String[] args) {
        Bus liaz = new Bus("Лиаз", 40f, 7.5f);
        Bus zil = new Bus("ЗИЛ", 40f, 7.5f);
        liaz.drive();
        zil.drive();
    }
}
