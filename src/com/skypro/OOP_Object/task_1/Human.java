package com.skypro.OOP_Object.task_1;

public class Human {

    int yearsBerth;
    String name;
    String cityBerth;
    String position;

    void printHuman() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Работаю в должности %s. Будем знакомы!\n", name, cityBerth, yearsBerth, position);
    }
}