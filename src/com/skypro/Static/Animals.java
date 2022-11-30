package com.skypro.Static;

import static com.skypro.Incapsulyaciya.ValidateUtils.validateInteger;
import static com.skypro.Incapsulyaciya.ValidateUtils.validateString;

import java.time.LocalDate;

public abstract class Animals {
    private final String nameAnimals;
    private final int yearsBerth;
    public LocalDate date = LocalDate.now();

    public Animals(String nameAnimals, int age) {
        this.nameAnimals = validateNameAnimals(nameAnimals);
        this.yearsBerth = validateYearsBerth(date.getYear() - age);
    }

    private String validateNameAnimals(String value) {
        return validateString(value, "Неизвестное животное");
    }

    public String getNameAnimals() {
        return nameAnimals;
    }

    private int validateYearsBerth(int value) {
        return validateInteger(value, 0);
    }

    public int getYearsBerth() {
        return yearsBerth;
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
}
