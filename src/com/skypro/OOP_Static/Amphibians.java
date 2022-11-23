package com.skypro.OOP_Static;

import java.util.Objects;

import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateString;

public class Amphibians extends Animals {
    private final String livingEnvironment;

    public Amphibians(String nameAnimals, int age, String livingEnvironment) {
        super(nameAnimals, age);
        this.livingEnvironment = validateLivingEnvironment(livingEnvironment);
        this.eat();
        this.sleep();
        this.go();
        this.hunters();
        this.printAmphibias();
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    private String validateLivingEnvironment(String value) {
        return validateString(value, "Неизвестная среда проживания");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment());
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
        return "Животное охотится ";
    }

    public void printAmphibias() {
        System.out.println("Класс: Животные, Подкласс: Земноводные, Название животного: " +
                getNameAnimals() + ", возрвст: " + getYearsBerth() + ", среда проживания: " + getLivingEnvironment() +
                ", в течении жизни животное: " + eat() + ", " + sleep() + ", " + go() + ", " + hunters());
    }
}
