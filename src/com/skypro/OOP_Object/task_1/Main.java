package com.skypro.OOP_Object.task_1;

public class Main {

    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Object");
        System.out.println();
        System.out.println("task1-2");

        Human maksim = new Human();
        maksim.yearsBerth = 1987;
        maksim.name = "Максим";
        maksim.cityBerth = "Минск";
        maksim.position = "бренд-менеджером";
        maksim.printHuman();

        Human anya = new Human();
        anya.yearsBerth = 1993;
        anya.name = "Аня";
        anya.cityBerth = "Москва";
        anya.position = "методистом образовательных программ";
        anya.printHuman();

        Human katya = new Human();
        katya.yearsBerth = 1994;
        katya.name = "Катя";
        katya.cityBerth = "Калининград";
        katya.position = "продакт-менеджером";
        katya.printHuman();

        Human artem = new Human();
        artem.yearsBerth = 1995;
        artem.name = "Артем";
        artem.cityBerth = "Москва";
        artem.position = "директора по развитию бизнеса";
        artem.printHuman();

        System.out.println();
        System.out.println("task3");
        Car ladaGrande = new Car();
        ladaGrande.brand = "Lada";
        ladaGrande.model = "Grande";
        ladaGrande.engineVolume = 1.7;
        ladaGrande.color = "желтый";
        ladaGrande.productionYear = 2015;
        ladaGrande.productionCountry = "Россия";
        ladaGrande.printCar();

        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.engineVolume = 3.0;
        audiA8.color = "черный";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Германия";
        audiA8.printCar();

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "черный";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германия";
        bmwZ8.printCar();

        Car kiaSportage = new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage4";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.color = "красный";
        kiaSportage.productionYear = 2018;
        kiaSportage.productionCountry = "Южная Корея";
        kiaSportage.printCar();

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южная Корея";
        hyundaiAvante.printCar();

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
