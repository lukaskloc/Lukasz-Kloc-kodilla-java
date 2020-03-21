package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }
    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        return getCountryName().equals(country.getCountryName());
    }

    @Override
    public int hashCode() {
        return getCountryName().hashCode();
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
