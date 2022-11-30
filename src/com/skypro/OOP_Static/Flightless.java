package com.skypro.OOP_Static;

import java.util.Objects;

import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateString;

public class Flightless extends Birds {
    private final String typeGo;

    public Flightless(String nameAnimals, int age, String livingEnvironment, String typeGo) {
        super(nameAnimals, age, livingEnvironment);
        this.typeGo = validateTypeGo(typeGo);
        this.eat();
        this.sleep();
        this.go();
        this.hunters();
        this.walk();
    }

    public String getTypeGo() {
        return typeGo;
    }

    private String validateTypeGo(String value) {
        return validateString(value, "Неизвестный тип передвижения");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(getTypeGo(), that.getTypeGo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeGo());
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

    String hunters() {
        return "Животное охотиться ";
    }

    String walk() {
        return "Животное гуляет ";
    }

    @Override
    public String toString() {
        return "Класс: Животные, Подкласс: Птицы, Отряд: Нелетающие, Название животного: " +
                getNameAnimals() + ", возрвст: " + getYearsBerth() + ", среда проживания: " + getLivingEnvironment() + ", тип еды: " + getTypeGo() +
                ", в течении жизни животное: " + eat() + ", " + sleep() + ", " + go() + ", " + hunters() + ", " + walk();
    }
}
