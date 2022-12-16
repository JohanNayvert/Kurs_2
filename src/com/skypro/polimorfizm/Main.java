package com.skypro.polimorfizm;

import com.skypro.polimorfizm.support.ServiceStation;
import com.skypro.polimorfizm.transport.*;
import com.skypro.polimorfizm.drivers.DriversB;
import com.skypro.polimorfizm.drivers.DriversC;
import com.skypro.polimorfizm.drivers.DriversD;
import com.skypro.polimorfizm.support.Sponsors;
import com.skypro.polimorfizm.support.Mechanics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Object");

        System.out.println();
        System.out.println("Cars");
        Cars audiA8 = new Cars("Audi", "A8", 1.6, TypeCase.SEDAN);
        Cars bmvX5 = new Cars("BMV", "X5", 2.4, TypeCase.CROSSOVER);
        Cars kiaSport = new Cars("Kia", "Sportage", 1.8, TypeCase.HATCHBACK);
        Cars uazPatriot = new Cars("Uaz", "Patriot", 2.8, TypeCase.UNIVERSAL);
        System.out.println(audiA8);
        System.out.println(bmvX5);
        System.out.println(kiaSport);
        System.out.println(uazPatriot);

        System.out.println();
        System.out.println("Trucks");
        Trucks uralNext = new Trucks("Ural", "Next", 6.7, LoadCapacity.N1);
        Trucks mercedesActros = new Trucks("Mercedes", "Actros", 15.6, LoadCapacity.N3);
        Trucks shaanqi = new Trucks("Shaanqi", "Shaanxi", 12.4, LoadCapacity.N2);
        Trucks hovo = new Trucks("HOWO", "T4", 14.2, LoadCapacity.N3);
        System.out.println(uralNext);
        System.out.println(mercedesActros);
        System.out.println(shaanqi);
        System.out.println(hovo);

        System.out.println();
        System.out.println("Buses");
        Buses paz = new Buses("ПАЗ", "1211", 19.3, Bulk.LARGE);
        Buses laz = new Buses("ЛАЗ", "1134", 19.8, Bulk.ESPECIALLY_LARGE);
        Buses ikarus = new Buses("Икарус", "B-343", 19.9, Bulk.LARGE);
        Buses mercedesForse = new Buses("Mercedes", "Forse", 14.1, Bulk.EXTRA_SMALL);
        System.out.println(paz);
        System.out.println(laz);
        System.out.println(ikarus);
        System.out.println(mercedesForse);

        System.out.println();
        System.out.println("Driver");
        DriversB<Cars> pit = new DriversB<>("Piter Gray", "B", 8.6);
        audiA8.addDriver(pit);
        System.out.println(pit + ", управляет - " + audiA8);
        DriversB<Cars> smith = new DriversB<>("Jason Smith", "B", 12.5);
        bmvX5.addDriver(smith);
        System.out.println(smith + ", управляет - " + bmvX5);
        DriversC<Trucks> sem = new DriversC<>("Semuel Tarcov", "C", 6.3);
        uralNext.addDriver(sem);
        System.out.println(sem + ", управляет - " + uralNext);
        DriversD<Buses> tom = new DriversD<>("Tomas Franklin", "D", 12.5);
        ikarus.addDriver(tom);
        System.out.println(tom + ", управляет - " + ikarus);

        System.out.println();
        System.out.println("Sponsors");
        Sponsors gazprom = new Sponsors("Газпром", 1500000);
        audiA8.addSponsor(gazprom);
        Sponsors vesternynion = new Sponsors("Вестерн Юнион", 900_000);
        bmvX5.addSponsor(vesternynion);
        Sponsors beeline = new Sponsors("Билайн", 1_600_000);
        uralNext.addSponsor(beeline);
        Sponsors anisimov = new Sponsors("ИП Анисимов(Фрукты и Овощи inc.)", 1_000_000_000);
        ikarus.addSponsor(anisimov);
        audiA8.addSponsor(anisimov);
        bmvX5.addSponsor(anisimov);
        uralNext.addSponsor(anisimov);
        System.out.println(gazprom);
        System.out.println(vesternynion);
        System.out.println(beeline);
        System.out.println(anisimov);

        System.out.println();
        System.out.println("Mechanics");
        Mechanics<Cars> fred = new Mechanics<>("Fredi Doodls", "SupreComm");
        audiA8.addMehanic(fred);
        Mechanics<Cars> richard = new Mechanics<>("Richard Nikelson", "Ferrari");
        bmvX5.addMehanic(richard);
        Mechanics<Trucks> akaDodge = new Mechanics<>("Judi McFly", "DolcheRoni");
        uralNext.addMehanic(akaDodge);
        Mechanics<Buses> pol = new Mechanics<>("Poll Kertison", "Ford");
        ikarus.addMehanic(pol);
        System.out.println(fred);
        System.out.println(richard);
        System.out.println(akaDodge);
        System.out.println(pol);

        System.out.println();
        System.out.println("Участники гонки: ");
        List<Transport> transports = List.of(audiA8, bmvX5, uralNext, ikarus);

        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport : transports)
        Transport.printInfo(transport);

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
