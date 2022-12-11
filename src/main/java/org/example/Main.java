package org.example;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Количество квадратов в заданном диапазоне - " + (service.calcService(701, 9801)));
    }
}