package com.skypro.Static;

import java.util.Objects;

import static com.skypro.Incapsulyaciya.ValidateUtils.validateString;

public class Flying extends Birds {
    private final String typeGo;

    public Flying(String nameAnimals, int age, String livingEnvironment, String typeGo) {
        super(nameAnimals, age, livingEnvironment);
        this.typeGo = validateTypeGo(typeGo);
        this.eat();
        this.sleep();
        this.go();
        this.hunters();
        this.fly();
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
        if (!(o instanceof Flying)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getTypeGo(), flying.getTypeGo());
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

    String fly() {
        return "Животное летает ";
    }

    @Override
    public String toString() {
        return "Класс: Животные, Подкласс: Птицы, Отряд: Летающие, Название животного: " +
                getNameAnimals() + ", возрвст: " + getYearsBerth() + ", среда проживания: " + getLivingEnvironment() + ", тип еды: " + getTypeGo() +
                ", в течении жизни животное: " + eat() + ", " + sleep() + ", " + go() + ", " + hunters() + ", " + fly();
    }
}
