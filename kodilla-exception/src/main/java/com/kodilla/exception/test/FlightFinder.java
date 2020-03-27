package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airports = new HashMap<>();

        airports.put("Chopin Airport", true);
        airports.put("Berlin Airport", true);
        airports.put("Balice Airport", false);
        airports.put("Radom Airport", false);

        if(airports.containsKey(flight.getArrivalAirport())) {
            boolean status = airports.get(flight.getArrivalAirport());

            if(status == true) {
                System.out.println("Destination is available.");
            } else {
                System.out.println("Destination not available at this time!");
            }
        } else {
            throw new RouteNotFoundException();
        }


    }
    public static void main(String[] args) {
        Flight flight = new Flight("Berlin Airport", "Katowice Airport");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println("Destination not found!");
        }
    }
}
