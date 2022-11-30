package com.skypro.Object.task_2_3;

public class HumanKonstrukt {

    int yearsBerth;
    String name;
    String cityBerth;
    String position;

    void printHuman() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Работаю в должности %s. Будем знакомы!\n", name, cityBerth, yearsBerth, position);

    }

    HumanKonstrukt(int yearsBerth, String name, String cityBerth, String position) {
        if (yearsBerth > 0) {
            this.yearsBerth = yearsBerth;
        } else {
            this.yearsBerth = 0;
        }
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана!";
        }
        if (cityBerth != null) {
            this.cityBerth = cityBerth;
        } else {
            this.cityBerth = "Информация не указана!";
        }
        if (position != null) {
            this.position = position;
        } else {
            this.position = "Информация не указана!";
        }
        this.printHuman();
    }
}