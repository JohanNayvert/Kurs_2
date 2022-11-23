package com.skypro.OOP_Incapsul.task_1.transport;

import java.time.LocalDate;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String typeTransmission;
    private String typeCarcase;
    private String registrationNumber;
    private int coastSeats;
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
            if (durationOfInsurance == null) {
                this.durationOfInsurance = LocalDate.now().plusDays(365);
            } else {
                this.durationOfInsurance = durationOfInsurance;
            }
            this.costInsurance = costInsurance;
            if (numberInsurance == null) {
                this.numberInsurance = "123456789";
            } else {
                this.numberInsurance = numberInsurance;
            }

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

    public void printCar() {
        System.out.println(brand + model +
                ", года выпуска " + productionYear +
                ", сборка в " + productionCountry +
                ", цвет кузова " + color +
                ", обьем двигателя " + engineVolume +
                ", тип трансмиссии " + typeTransmission +
                ", тип кузова " + typeCarcase +
                ", регистрационный номер " + registrationNumber +
                ", количество мест " + coastSeats +
                ", тип шин " + (changeTires() ? "летняя" : "зимняя") +
                ", доступ " + (getKey().isKeylessAccess() ? "ключевой" : "безключевой") +
                ", номер страховки " + (getInsurance().getNumberInsurance()) +
                ", цена страховки " + (getInsurance().getCostInsurance()) +
                ", дата окончания страховки " + getInsurance().durationOfInsurance);
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String typeTransmission, String typeCarcase, int coastSeats,
               String registrationNumber, Boolean typeTires, Key key, Insurance insurance) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Информация не указана!";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Информация не указана!";
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 0;
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Информация не указана!";
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 0;
        }
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "Информация не указана!";
        }
        if (typeTransmission != null && !typeTransmission.isEmpty() && !typeTransmission.isBlank()) {
            this.typeTransmission = typeTransmission;
        } else {
            this.typeTransmission = "Информация не указана!";
        }
        if (typeCarcase != null && !typeCarcase.isEmpty() && !typeCarcase.isBlank()) {
            this.typeCarcase = typeCarcase;
        } else {
            this.typeCarcase = "Информация не указана!";
        }
        if (coastSeats > 0) {
            this.coastSeats = coastSeats;
        } else {
            this.coastSeats = 0;
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Информация не указана!";
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.typeTires = true;
        this.printCar();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public String getTypeCarcase() {
        return typeCarcase;
    }

    public int getCoastSeats() {
        return coastSeats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getTypeTires() {
        return typeTires;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public boolean isTypeTires() {
        return typeTires;
    }

    public Key getKey() {
        return key;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 0;
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Информация не указана!";
        }
    }

    public void setTypeTransmission(String typeTransmission) {
        if (typeTransmission != null && !typeTransmission.isEmpty() && !typeTransmission.isBlank()) {
            this.typeTransmission = typeTransmission;
        } else {
            this.typeTransmission = "Информация не указана!";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Информация не указана!";
        }
    }

    public void setTypeTires(String typeTires) {
        if (typeTires != null && !typeTires.isEmpty() && !typeTires.isBlank()) {
            this.typeTires = true;
        } else {
            this.typeTires = false;
        }
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean changeTires() {
        typeTires = !typeTires;
        return false;
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
}