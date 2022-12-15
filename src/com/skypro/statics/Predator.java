package com.skypro.statics;

import java.util.Objects;

import static com.skypro.incapsulyaciya.ValidateUtils.validateString;

public class Predator extends Mammals {
    private final String typeEat;

    public Predator(String nameAnimals, int age, String livingEnvironment, int speedGo, String typeEat) {
        super(nameAnimals, age, livingEnvironment, speedGo);
        this.typeEat = validateTypeEat(typeEat);
        this.eat();
        this.sleep();
        this.go();
        this.walk();
        this.hunters();
    }

    public String getTypeEat() {
        return typeEat;
    }

    private String validateTypeEat(String value) {
        return validateString(value, "Неизвестный тип еды");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(getTypeEat(), predator.getTypeEat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeEat());
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

    String hunters() {
        return "Животное охотиться ";
    }

    @Override
    public String toString() {
        return "Класс: Животные, Подкласс: Млекопетающие, Отряд: Хищники, Название животного: " +
                getNameAnimals() + ", возрвст: " + getYearsBerth() + ", среда проживания: " + getLivingEnvironment() + ", скорость передвижения: " + getSpeedGo() + ", тип еды: " + getTypeEat() +
                ", в течении жизни животное: " + eat() + ", " + sleep() + ", " + go() + ", " + walk() + ", " + hunters();
    }
}
