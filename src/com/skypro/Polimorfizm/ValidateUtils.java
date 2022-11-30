package com.skypro.Polimorfizm;

public class ValidateUtils {

    public static String validateString(String value, String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    public static int validateInteger(int value, int substitution) {
        return (value <= 0) ? substitution : value;
    }

    public static double validateDouble(double value, double substitution) {
        return (value <= 0) ? substitution : value;
    }

    public static boolean validateBoolean(boolean value) {
        return value;
    }
}
