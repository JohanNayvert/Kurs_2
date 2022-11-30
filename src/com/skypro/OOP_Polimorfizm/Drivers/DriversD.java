package com.skypro.OOP_Polimorfizm.Drivers;

import com.skypro.OOP_Polimorfizm.Transport.Buses;

public class DriversD<D extends Buses> extends Drivers {

    public DriversD(String fullName, String driverLicense, double experience) {
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
