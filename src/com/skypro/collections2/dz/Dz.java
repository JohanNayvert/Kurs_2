package com.skypro.collections2.dz;

import java.util.Objects;

public class Dz {

    private final int a;
    private final int b;

    public Dz(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dz dz = (Dz) o;
        return a == dz.a && b == dz.b ||  a == dz.b && b == dz.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a) + Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a + " * " + b + " = ?";
    }
}
