package com.skypro.OOP_Polimorfizm;

import com.skypro.OOP_Polimorfizm.Transport.Buses;
import com.skypro.OOP_Polimorfizm.Transport.Cars;
import com.skypro.OOP_Polimorfizm.Transport.Trucks;
import com.skypro.OOP_Polimorfizm.Drivers.DriversB;
import com.skypro.OOP_Polimorfizm.Drivers.DriversC;
import com.skypro.OOP_Polimorfizm.Drivers.DriversD;

public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Object");

        System.out.println();
        System.out.println("Cars");
        Cars audiA8 = new Cars("Audi", "A8", 1.6);
        Cars bmvX5 = new Cars("BMV", "X5", 2.4);
        Cars kiaSport = new Cars("Kia", "Sportage", 1.8);
        Cars uazPatriot = new Cars("Uaz", "Patriot", 2.8);
        System.out.println(audiA8);
        System.out.println(bmvX5);
        System.out.println(kiaSport);
        System.out.println(uazPatriot);

        System.out.println();
        System.out.println("Trucks");
        Trucks uralNext = new Trucks("Ural", "Next", 6.7);
        Trucks mercedesActros = new Trucks("Mercedes", "Actros", 15.6);
        Trucks shaanqi = new Trucks("Shaanqi", "Shaanxi", 12.4);
        Trucks hovo = new Trucks("HOWO", "T4", 14.2);
        System.out.println(uralNext);
        System.out.println(mercedesActros);
        System.out.println(shaanqi);
        System.out.println(hovo);

        System.out.println();
        System.out.println("Buses");
        Buses paz = new Buses("ПАЗ", "1211", 19.3);
        Buses laz = new Buses("ЛАЗ", "1134", 19.8);
        Buses ikarus = new Buses("Икарус", "B-343", 19.9);
        Buses mercedesForse = new Buses("Mercedes", "Forse", 14.1);
        System.out.println(paz);
        System.out.println(laz);
        System.out.println(ikarus);
        System.out.println(mercedesForse);

        System.out.println();
        System.out.println("Driver_B");
        DriversB<Cars> pit = new DriversB<>("Piter Gray", "B", 8.6);
        System.out.println(pit + ", управляет - " + audiA8);
        DriversC<Trucks> sem = new DriversC<>("Semuel Tarcov", "C", 6.3);
        System.out.println(sem + ", управляет - " + uralNext);
        DriversD<Buses> tom = new DriversD<>("Tomas Franklin", "D", 12.5);
        System.out.println(tom + ", управляет - " + ikarus);

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
