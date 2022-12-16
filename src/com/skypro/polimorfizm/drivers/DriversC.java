package com.skypro.polimorfizm.drivers;

import com.skypro.polimorfizm.transport.Trucks;

public class DriversC<C extends Trucks> extends Drivers {

    public DriversC(String fullName, String driverLicense, double experience) {
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
