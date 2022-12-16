package com.skypro.polimorfizm.transport;

import com.skypro.polimorfizm.drivers.Drivers;
import com.skypro.polimorfizm.support.Mechanics;
import com.skypro.polimorfizm.support.Sponsors;

import java.util.*;

import static com.skypro.incapsulyaciya.ValidateUtils.validateDouble;
import static com.skypro.incapsulyaciya.ValidateUtils.validateString;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;

    private final Set<Drivers> drivers;
    private final Set<Mechanics> mechanics;
    private final Set<Sponsors> sponsors;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.drivers = new HashSet<>();
        this.mechanics = new HashSet<>();
        this.sponsors = new HashSet<>();
    }

    public String getBrand() {
        return brand;
    }

    private String validateBrand(String value) {
        return validateString(value, "Не указана");
    }

    public String getModel() {
        return model;
    }

    private String validateModel(String value) {
        return validateString(value, "Не указана");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    private double validateEngineVolume(double value) {
        return validateDouble(value, 0);
    }

    public Set<?> getDrivers() {
        return drivers;
    }

    public Set<?> getMechanics() {
        return mechanics;
    }

    public Set<?> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(), getEngineVolume()) == 0 && getBrand().equals(transport.getBrand()) && getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", обьем двигателя: " + engineVolume;
    }

    public abstract String startMoving();

    public abstract String finishMoving();

    public abstract void printType();
    public abstract boolean service();
    public abstract void fixCar();
    public void addDriver(Drivers driver){
        this.drivers.add(driver);
    }
    public void addMehanic(Mechanics mechanics){
        this.mechanics.add(mechanics);
    }
    public void addSponsor(Sponsors sponsor){
        sponsors.add(sponsor);
    }

    public static void printInfo (Transport transports){
        System.out.println("Гоночный болид: " + transports.getBrand() + transports.getModel());
        System.out.println("Пилот: " + transports.getDrivers());
        System.out.println("Спонсоры заезда: " + transports.getSponsors());
        System.out.println("Команда механников: " + transports.getMechanics());
        System.out.println();
    }
}
