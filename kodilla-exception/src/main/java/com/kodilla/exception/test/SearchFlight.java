package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight{
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirport = new HashMap<>();
        availableAirport.put("Radom",true);
        availableAirport.put("Warszawa",true);
        availableAirport.put("Gdańsk",false);
        availableAirport.put("Poznań",true);
        availableAirport.put("Kraków",false);
        if(!availableAirport.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        return availableAirport.get(flight.getArrivalAirport());
    }
}
