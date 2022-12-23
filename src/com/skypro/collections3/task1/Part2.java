package com.skypro.collections3.task1;

import java.util.HashMap;
import java.util.Map;

public class Part2 {

    public static final Map<String, Integer> Map1 = new HashMap<>();

    public static void main(String[] args) {

        addMap1("str1", 1);
        addMap1("str2", 1);
        addMap1("str2", 3);
        addMap1("str4", 4);
        addMap1("str5", 5);
        addMap1("str6", 6);

        for (Map.Entry<String, Integer> mapEntry : Map1.entrySet()){
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }
    }

    private static void addMap1(String s, Integer i){
        if (Map1.containsKey(s) && Map1.containsValue(i)){
            throw new RuntimeException(Map1 + "Такое значение уже существует.");
        }
        Map1.put(s, i);
    }
}
