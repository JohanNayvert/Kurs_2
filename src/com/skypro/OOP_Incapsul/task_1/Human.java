package com.skypro.OOP_Incapsul.task_1;

public class Human {

    private int yearsBerth;
    private String name;
    private String cityBerth;
    private String position;

    private void printHuman() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Работаю в должности %s. Будем знакомы!\n", name, cityBerth, yearsBerth, position);

    }

    Human(int yearsBerth, String name, String cityBerth, String position) {
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

    public int getYearsBerth() {
        if (yearsBerth >= 0) {
            this.yearsBerth = yearsBerth;
        } else {
            this.yearsBerth = 0;
        }
        return yearsBerth;
    }

    public String getName() {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана!";
        }
        return name;
    }

    public String getCityBerth() {
        if (cityBerth != null) {
            this.cityBerth = cityBerth;
        } else {
            this.cityBerth = "Информация не указана!";
        }
        return cityBerth;
    }

    public String getPosition() {
        if (position != null) {
            this.position = position;
        } else {
            this.position = "Информация не указана!";
        }
        return position;
    }

    public void setYearsBerth(int yearsBerth) {
        this.yearsBerth = yearsBerth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCityBerth(String cityBerth) {
        this.cityBerth = cityBerth;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}