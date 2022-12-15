package com.skypro.polimorfizm.transport;

public enum LoadCapacity {

    N1(0D, 3.5),
    N2(3.5, 12D),
    N3(12D, 24D);

    private final double from;
    private final double to;

    LoadCapacity(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "LoadCapacity{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
