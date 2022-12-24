package com.skypro.collections3.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part1 {

    public static void main(String[] args) {

        Map<String, List<Integer>> Map2 = new HashMap<>();

        Map2.put("str1", List.of(1,2,3));
        Map2.put("str2", List.of(10,20,30));
        Map2.put("str3", List.of(100,200,300));

        Map<String, Integer> Map22 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> map22Entry : Map2.entrySet()) {
            Map22.put(map22Entry.getKey(), sumMap2(map22Entry.getValue()));
        }
        for (Map.Entry<String, Integer> sumMap22 : Map22.entrySet()){
            System.out.println(sumMap22.getKey() + " - " + sumMap22.getValue());
        }
    }

    private static Integer sumMap2(List<Integer> i) {
        Integer sum = 0;
        for (Integer e : i) {
            sum += e;
        }
        return sum;
    }

}
