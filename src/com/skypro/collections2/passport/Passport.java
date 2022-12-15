package com.skypro.collections2.passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private String number;
    private String name;
    private String surName;
    private String patronymic;
    private LocalDate birthDate;

    public Passport(String number, String name, String surName, String patronymic, LocalDate birthDate) {
        this.number = number;
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Номер: " + number +
                ", Имя: " + name +
                ", Фамилия: " + surName +
                ", Отчество (если есть): " + patronymic +
                ", год рождения: " + birthDate;
    }
}
