package com.kodilla.good.patterns.challenges.airlines;

import java.util.Objects;

public class Airport {

    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getName(), airport.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}