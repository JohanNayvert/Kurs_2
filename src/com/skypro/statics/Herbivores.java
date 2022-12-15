package com.skypro.statics;

import static com.skypro.incapsulyaciya.ValidateUtils.validateString;

public class Herbivores extends Mammals {
    private final String typeEat;

    public Herbivores(String nameAnimals, int age, String livingEnvironment, int speedGo, String typeEat) {
        super(nameAnimals, age, livingEnvironment, speedGo);
        this.typeEat = validateTypeEat(typeEat);
        this.eat();
        this.sleep();
        this.go();
        this.walk();
        this.pasture();
    }

    public String getTypeEat() {
        return typeEat;
    }

    private String validateTypeEat(String value) {
        return validateString(value, "Неизвестный тип еды");
    }

    String eat() {
        return "Животное ест ";
    }

    String sleep() {
        return "Животное спит ";
    }

    String go() {
        return "Животное перемещается ";
    }

    String walk() {
        return "Животное гуляет ";
    }

    String pasture() {
        return "Животное пасется ";
    }

    @Override
    public String toString() {
        return "Класс: Животные, Подкласс: Млекопетающие, Отряд: Травоядные, Название животного: " +
                getNameAnimals() + ", возрвст: " + getYearsBerth() + ", среда проживания: " + getLivingEnvironment() + ", скорость передвижения: " + getSpeedGo() + ", тип еды: " + getTypeEat() +
                ", в течении жизни животное: " + eat() + ", " + sleep() + ", " + go() + ", " + walk() + ", " + pasture();
    }
}
