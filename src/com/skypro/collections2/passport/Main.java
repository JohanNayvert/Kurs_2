package com.skypro.collections2.passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("7789 223890", "Иван", "Иванов", "Иванович", LocalDate.now().minusYears(32)));
        passports.add(new Passport("7789 223890", "Иван", "Иванов", "Иванович", LocalDate.now().minusYears(32)));

        PassportList passportList = new PassportList(passports);

        System.out.println(passports);
    }

}
