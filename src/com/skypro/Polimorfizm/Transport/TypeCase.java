package com.skypro.Polimorfizm.Transport;

public enum TypeCase {

    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("СМинивэн");

    private final String nameCarCase;

    TypeCase(String nameCarCase) {
        this.nameCarCase = nameCarCase;
    }

    public String getNameCarCase() {
        return nameCarCase;
    }

    @Override
    public String toString() {
        return "TypeCase{" +
                "nameCarCase='" + nameCarCase + '\'' +
                '}';
    }
}
