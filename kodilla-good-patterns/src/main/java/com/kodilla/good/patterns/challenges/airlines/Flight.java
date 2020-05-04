package com.kodilla.good.patterns.challenges.airlines;

import java.util.Objects;

public class Flight {

    private Airport arrivalAirport;
    private Airport departureAirport;
    private Airport transferAirport;

    public Flight(Airport arrivalAirport, Airport departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport ;
    }

    public Flight(Airport arrivalAirport, Airport departureAirport, Airport transferAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.transferAirport = transferAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Airport getDepartureAirports() {
        return departureAirport;
    }

    public Airport getTransferAirport() {
        return transferAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalAirport=" + arrivalAirport +
                ", departureAirport=" + departureAirport +
                ", transferAirport=" + transferAirport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getArrivalAirport(), flight.getArrivalAirport()) &&
                Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(getTransferAirport(), flight.getTransferAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrivalAirport(), departureAirport, getTransferAirport());
    }
}
