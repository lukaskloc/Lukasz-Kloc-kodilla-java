package com.kodilla.good.patterns.challenges.airlines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionMap {

    public Map<Airport, List<Airport>> connection () {

        List<Airport> departureAirportsList = new ArrayList<>();
        departureAirportsList.add(new Airport("Kraków"));
        departureAirportsList.add(new Airport("Wrocław"));
        departureAirportsList.add(new Airport("Berlin"));
        departureAirportsList.add(new Airport("Praga"));
        departureAirportsList.add(new Airport("Paryż"));
        departureAirportsList.add(new Airport("Radom"));

        List<Airport> arrivalAirportsList = new ArrayList<>();
        arrivalAirportsList.add(new Airport("Kraków"));
        arrivalAirportsList.add(new Airport("Gdańsk"));
        arrivalAirportsList.add(new Airport("Wrocław"));
        arrivalAirportsList.add(new Airport("Wilno"));
        arrivalAirportsList.add(new Airport("Madryt"));
        arrivalAirportsList.add(new Airport("Monachium"));
        arrivalAirportsList.add(new Airport("Oslo"));
        arrivalAirportsList.add(new Airport("Moskwa"));

        List<Airport> fromKrakow = new ArrayList<>();
        fromKrakow.add(new Airport("Wilno"));
        fromKrakow.add(new Airport("Madryt"));
        fromKrakow.add(new Airport("Oslo"));
        fromKrakow.add(new Airport("Moskwa"));

        List<Airport> fromGdansk = new ArrayList<>();
        fromGdansk.add(new Airport("Wrocłąw"));
        fromGdansk.add(new Airport("Monachium"));
        fromGdansk.add(new Airport("Moskwa"));

        List<Airport> fromOslo = new ArrayList<>();
        fromOslo.add(new Airport("Wilno"));
        fromOslo.add(new Airport("Madryt"));
        fromOslo.add(new Airport("Kraków"));
        fromOslo.add(new Airport("Moskwa"));


        Map<Airport, List<Airport>> connectMap = new HashMap<>();
        connectMap.put(new Airport("Kraków"), fromKrakow);
        connectMap.put(new Airport("Gdańsk"), fromGdansk);
        connectMap.put(new Airport("Oslo"), fromOslo);

        return connectMap;
    }

    public ConnectionMap() {
    }
}
