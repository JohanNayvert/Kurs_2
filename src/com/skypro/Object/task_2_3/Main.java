package com.skypro.Object.task_2_3;

public class Main {

    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Object");

        System.out.println();
        System.out.println("task_1");
        HumanKonstrukt maksim = new HumanKonstrukt(1987, "Максим", "Минск", "бренд-менеджером");
        HumanKonstrukt anya = new HumanKonstrukt(1993, "Аня", "Москва", "методистом образовательных программ");
        HumanKonstrukt katya = new HumanKonstrukt(1994, "Катя", "Калининград", "продакт-менеджером");
        HumanKonstrukt artem = new HumanKonstrukt(1995, "Артем", "Москва", "директора по развитию бизнеса");

        System.out.println();
        System.out.println("task_2");
        CarKonstrukt ladaGrande = new CarKonstrukt("lada", "Grande", 1.7, "желтый", 2015, "Россия");
        CarKonstrukt audiA8 = new CarKonstrukt("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        CarKonstrukt bmwZ8 = new CarKonstrukt("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        CarKonstrukt kiaSportage4 = new CarKonstrukt("Kia", "Sportage4", 2.4, "желтый", 2018, "Южная Корея");
        CarKonstrukt hyundaiAvante = new CarKonstrukt("Hyundai", "Avante", 1.6, "желтый", 2016, "Южная Корея");

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
