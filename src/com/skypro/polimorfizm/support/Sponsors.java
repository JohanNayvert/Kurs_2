package com.skypro.polimorfizm.support;

import java.util.Objects;

public class Sponsors {

    private String name;
    private double supportAmount ;

    public Sponsors(String name, double supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(double supportAmount) {
        this.supportAmount = supportAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsors)) return false;
        Sponsors sponsors = (Sponsors) o;
        return Double.compare(sponsors.getSupportAmount(), getSupportAmount()) == 0 && getName().equals(sponsors.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSupportAmount());
    }

    @Override
    public String toString() {
        return "Название компании " + name +
                ", сумма поддержки: " + supportAmount;
    }

    public void toSupportDriver() {
        System.out.println("Спонсор \"" + name + "\", оказал поддержку в размере: " + supportAmount);
    }
}
