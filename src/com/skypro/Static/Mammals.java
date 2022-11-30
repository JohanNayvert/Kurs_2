package com.skypro.Static;

import java.util.Objects;

import static com.skypro.Incapsulyaciya.ValidateUtils.validateString;
import static com.skypro.Incapsulyaciya.ValidateUtils.validateInteger;

public class Mammals extends Animals {
    private final String livingEnvironment;
    private final int speedGo;

    public Mammals(String nameAnimals, int age, String livingEnvironment, int speedGo) {
        super(nameAnimals, age);
        this.livingEnvironment = validateLivingEnvironment(livingEnvironment);
        this.speedGo = validateSpeedGo(speedGo);
        this.eat();
        this.sleep();
        this.go();
        this.walk();
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    private String validateLivingEnvironment(String value) {
        return validateString(value, "Неизвестная среда проживания");
    }

    public int getSpeedGo() {
        return speedGo;
    }

    private int validateSpeedGo(int value) {
        return validateInteger(value, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        Mammals mammals = (Mammals) o;
        return getSpeedGo() == mammals.getSpeedGo() && Objects.equals(getLivingEnvironment(), mammals.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLivingEnvironment(), getSpeedGo());
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
}
