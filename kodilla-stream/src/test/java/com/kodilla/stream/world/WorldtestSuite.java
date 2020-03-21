package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldtestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //When
        List<Country> europeCountryList = new ArrayList<>();
        Continent europe = new Continent("Europe", europeCountryList );
        europeCountryList.add(new Country("Poland", new BigDecimal("38000000")));
        europeCountryList.add(new Country("Germany", new BigDecimal("60000000")));
        europeCountryList.add(new Country("France", new BigDecimal("75000000")));
        europeCountryList.add(new Country("Czechia", new BigDecimal("12000000")));
        europeCountryList.add(new Country("Spain", new BigDecimal("55000000")));

        List<Country> africaCountryList = new ArrayList<>();
        Continent africa = new Continent("Africa", africaCountryList );
        africaCountryList.add(new Country("Kongo", new BigDecimal("38000000")));
        africaCountryList.add(new Country("Uganda", new BigDecimal("60000000")));
        africaCountryList.add(new Country("Ghana", new BigDecimal("75000000")));
        africaCountryList.add(new Country("Nigeria", new BigDecimal("12000000")));
        africaCountryList.add(new Country("Zimbabwe", new BigDecimal("55000000")));

        List<Country> asiaCountryList = new ArrayList<>();
        Continent asia = new Continent("Asia", asiaCountryList );
        asiaCountryList.add(new Country("Vietnam", new BigDecimal("38000000")));
        asiaCountryList.add(new Country("China", new BigDecimal("60000000")));
        asiaCountryList.add(new Country("India", new BigDecimal("75000000")));
        asiaCountryList.add(new Country("Vietnam", new BigDecimal("12000000")));
        asiaCountryList.add(new Country("Yemen", new BigDecimal("55000000")));

        World world = new World(Arrays.asList(europe, africa, asia));

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("720000000");
        Assert.assertEquals(expectedValue, worldPeopleQuantity);
    }
}
