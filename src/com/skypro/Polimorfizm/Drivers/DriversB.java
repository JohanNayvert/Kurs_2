package com.skypro.Polimorfizm.Drivers;

import com.skypro.Polimorfizm.Transport.Cars;

public class DriversB<B extends Cars> extends Drivers {

    public DriversB(String fullName, String driverLicense, double experience) {
        super(fullName, driverLicense, experience);
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


}
