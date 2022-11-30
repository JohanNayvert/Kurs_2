package com.skypro.Incapsulyaciya.transport;

import com.skypro.Incapsulyaciya.ValidateUtils;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    private double engineVolume;
    private String typeTransmission;
    private final String typeCarcase;
    private String registrationNumber;
    private final int coastSeats;
    private boolean typeTires;
    private Key key;
    private Insurance insurance;

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate durationOfInsurance;
        private final double costInsurance;
        private final String numberInsurance;

        public Insurance(LocalDate durationOfInsurance, double costInsurance, String numberInsurance) {
            this.durationOfInsurance = Objects.requireNonNullElseGet(durationOfInsurance, () -> LocalDate.now().plusDays(365));
            this.costInsurance = costInsurance;
            this.numberInsurance = Objects.requireNonNullElse(numberInsurance, "123456789");
        }

        public Insurance() {
            this(null, 10000, null);
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public LocalDate getDurationOfInsurance() {
            return durationOfInsurance;
        }

        public void checkdurationOfInsurance() {
            if (durationOfInsurance.isBefore(LocalDate.now()) || durationOfInsurance.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumberInsurance() {
            if (numberInsurance.length() != 9) {
                System.out.println("Номер некоректный");
            }
        }

    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String typeTransmission, String typeCarcase, int coastSeats,
               String registrationNumber, Boolean typeTires, Key key, Insurance insurance, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.typeTransmission = validateTypeTransmission(typeTransmission);
        this.typeCarcase = validateTypeCarcase(typeCarcase);
        this.coastSeats = validateCoastSeats(coastSeats);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.key = Objects.requireNonNullElseGet(key, Key::new);
        this.insurance = Objects.requireNonNullElseGet(insurance, Insurance::new);
        this.typeTires = true;
        this.refill();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    private double validateEngineVolume(double value) {
        return ValidateUtils.validateDouble(value, 0);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    private String validateTypeTransmission(String value) {
        return ValidateUtils.validateString(value, "Информация не указана");
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = validateTypeTransmission(typeTransmission);
    }

    public String getTypeCarcase() {
        return typeCarcase;
    }

    private String validateTypeCarcase(String value) {
        return ValidateUtils.validateString(value, "Информация не указана");
    }

    public int getCoastSeats() {
        return coastSeats;
    }

    private int validateCoastSeats(int value) {
        return ValidateUtils.validateInteger(value, 5);
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    private String validateRegistrationNumber(String value) {
        return ValidateUtils.validateString(value, "x000xx000");
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
    }

    public boolean getTypeTires() {
        return typeTires;
    }

    public void setTypeTires(boolean typeTires) {
        this.typeTires = typeTires;
    }

    public boolean isTypeTires() {
        return typeTires;
    }

    public boolean changeTires() {
        typeTires = !typeTires;
        return false;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getEngineVolume(), getEngineVolume()) == 0 && getCoastSeats() == car.getCoastSeats() && isTypeTires() == car.isTypeTires() && getTypeTransmission().equals(car.getTypeTransmission()) && getTypeCarcase().equals(car.getTypeCarcase()) && getRegistrationNumber().equals(car.getRegistrationNumber()) && getKey().equals(car.getKey()) && getInsurance().equals(car.getInsurance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngineVolume(), getTypeTransmission(), getTypeCarcase(), getRegistrationNumber(), getCoastSeats(), isTypeTires(), getKey(), getInsurance());
    }

    public boolean checkRegNumber() {
        if (registrationNumber.length() != 9)
            return false;
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    @Override
    public void refill() {
        System.out.println("Машина заправляется на заправочной станции");
    }

    @Override
    public String toString() {
        return getBrand() + getModel() +
                ", года выпуска " + getProductionYear() +
                ", сборка в " + getProductionCountry() +
                ", цвет кузова " + getColor() +
                ", обьем двигателя " + engineVolume +
                ", тип трансмиссии " + typeTransmission +
                ", тип кузова " + typeCarcase +
                ", регистрационный номер " + registrationNumber +
                ", количество мест " + coastSeats +
                ", тип шин " + (changeTires() ? "летняя" : "зимняя") +
                ", доступ " + (getKey().isKeylessAccess() ? "ключевой" : "безключевой") +
                ", номер страховки " + (getInsurance().getNumberInsurance()) +
                ", цена страховки " + (getInsurance().getCostInsurance()) +
                ", дата окончания страховки " + getInsurance().durationOfInsurance;
    }
}