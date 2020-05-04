package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightScanner flightScanner = new FlightScanner();
        List<Airport> flightTo = flightScanner.searchFlightToList(new Airport("Oslo"));

        List<Airport> flightFrom = flightScanner.searchFlightFrom(new Airport("Kraków"));

        List<Flight> krkMd = flightScanner.searchFlightFromThroughTo(new Airport("Kraków"), new Airport("Madryt"));

        System.out.println(flightTo);
        System.out.println(flightFrom);
        System.out.println(krkMd);



    }
}