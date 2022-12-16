package com.skypro.polimorfizm.support;

import com.skypro.polimorfizm.transport.Transport;

import java.util.Objects;

public class Mechanics<T extends Transport> {

    public String fullName;
    public String company;

    public Mechanics(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanics)) return false;
        Mechanics<?> mechanics = (Mechanics<?>) o;
        return getFullName().equals(mechanics.getFullName()) && getCompany().equals(mechanics.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getCompany());
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName +
                ", компания: " + company;
    }

    public boolean carryService(T t){
        return t.service();
    }
}
