package com.skypro.polimorfizm.drivers;

import static com.skypro.incapsulyaciya.ValidateUtils.validateDouble;
import static com.skypro.incapsulyaciya.ValidateUtils.validateString;

public abstract class Drivers {

    private final String fullName;
    private final String driverLicense;
    private double experience;

    public Drivers(String fullName, String driverLicense, double experience) {
        this.fullName = validateName(fullName);
        this.driverLicense = validateDriverLicense(driverLicense);
        this.experience = validateExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    private String validateName(String value) {
        return validateString(value, "Не указана");
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    private String validateDriverLicense(String value) {
        return validateString(value, "Не указана");
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = validateExperience(experience);
    }

    private double validateExperience(double value) {
        return validateDouble(value, 0);
    }

    void startMovingInDriver() {
        System.out.println("Водитель начал движние");
    }

    void finishMovingInDriver() {
        System.out.println("Водитель закончил движние");
    }

    void refuelCar() {
        System.out.println("Водитель заправился");
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName +
                ", категория прав: " + driverLicense +
                ", опыт вождения: " + experience;
    }
}
