package com.skypro.exception;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exception");
        System.out.println();

        boolean authorization = Data.success("test", "test", "test");
        if (authorization) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрешен");
        }

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
