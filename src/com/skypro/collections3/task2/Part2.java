package com.skypro.collections3.task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Part2 {

    public static void main(String[] args) {

        Map<String, Integer> Map3 = new LinkedHashMap<>();

        Map3.put("str1", 1);
        Map3.put("str2", 2);
        Map3.put("str3", 3);
        Map3.put("str4", 4);
        Map3.put("str5", 5);
        Map3.put("str6", 6);
        Map3.put("str7", 7);
        Map3.put("str8", 8);
        Map3.put("str9", 9);
        Map3.put("str10", 10);

        for (Map.Entry<String, Integer> mapEntry : Map3.entrySet()){
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }
    }
}
