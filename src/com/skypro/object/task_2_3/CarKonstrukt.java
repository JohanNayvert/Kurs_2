package com.skypro.object.task_2_3;

public class CarKonstrukt {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void printCar() {
        System.out.printf("%s %s, %s года выпуска, сборка в %s, цвет кузова %s, обьем двигателя - %s\n", brand, model, productionYear, productionCountry, color, engineVolume);
    }

    CarKonstrukt(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = null;
            System.out.print("Информация не указана! ");
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = null;
            System.out.print("Информация не указана! ");
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 0;
            System.out.print("Информация не указана!");
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = null;
            System.out.print("Информация не указана! ");
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 0;
            System.out.print("Информация не указана!");
        }
        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = null;
            System.out.print("Информация не указана! ");
        }
        this.printCar();
    }
}