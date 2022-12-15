package com.skypro.collections2.many;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Many {

    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> many = new HashSet<>();

        while (many.size() < 20) {
            many.add(random.nextInt(1000));
        }
        System.out.println(many);

        Iterator<Integer> iterator = many.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(many);
    }
}
