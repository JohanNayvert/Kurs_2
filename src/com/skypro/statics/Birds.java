package com.skypro.statics;

import java.util.Objects;

import static com.skypro.incapsulyaciya.ValidateUtils.validateString;

public class Birds extends Animals {
    private final String livingEnvironment;

    public Birds(String nameAnimals, int age, String livingEnvironment) {
        super(nameAnimals, age);
        this.livingEnvironment = validateLivingEnvironment(livingEnvironment);
        this.eat();
        this.sleep();
        this.go();
        this.hunters();
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    private String validateLivingEnvironment(String value) {
        return validateString(value, "Неизвестная среда проживания");
    }

    private String validateSpeedGo(String value) {
        return validateString(value, "Неизвестная скорость передвижения");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(getLivingEnvironment(), birds.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLivingEnvironment());
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
}
