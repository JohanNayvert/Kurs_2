package com.skypro.polimorfizm.transport;

public enum Bulk {

    EXTRA_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);

    private final int from;
    private final int to;

    Bulk(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Bulk{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
