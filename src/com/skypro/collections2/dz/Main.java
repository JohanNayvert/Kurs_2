package com.skypro.collections2.dz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Dz> dz = new HashSet<>();
        while (dz.size()<15){
            Dz dzs = new Dz(random.nextInt(10), random.nextInt(10));
            dz.add(dzs);
            System.out.println(dzs);
        }
    }
}
