package com.skypro.Incapsulyaciya;

import java.util.Objects;

import static com.skypro.Incapsulyaciya.ValidateUtils.validateInteger;
import static com.skypro.Incapsulyaciya.ValidateUtils.validateString;

public class Human {

    private final int yearsBerth;
    private final String name;
    private final String cityBerth;
    private String position;

    Human(int yearsBerth, String name, String cityBerth, String position) {
        this.yearsBerth = validateYearsBerth(yearsBerth);
        this.name = validateName(name);
        this.cityBerth = validateCityBerth(cityBerth);
        this.position = validatePosition(position);
    }

    public int getYearsBerth() {
        return yearsBerth;
    }

    private int validateYearsBerth(int value) {
        return validateInteger(value, 0);
    }

    public String getName() {
        return name;
    }

    private String validateName(String value) {
        return validateString(value, "Не указана");
    }

    public String getCityBerth() {
        return cityBerth;
    }

    private String validateCityBerth(String value) {
        return validateString(value, "Не указана");
    }

    public String getPosition() {
        return position;
    }

    private String validatePosition(String value) {
        return validateString(value, "Не указана");
    }

    public void setPosition(String position) {
        this.position = validatePosition(position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYearsBerth() == human.getYearsBerth() && getName().equals(human.getName()) && getCityBerth().equals(human.getCityBerth()) && getPosition().equals(human.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYearsBerth(), getName(), getCityBerth(), getPosition());
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ", я из города" + cityBerth +
                ", я родился'" + yearsBerth +
                ", я работаю" + position;
    }
}