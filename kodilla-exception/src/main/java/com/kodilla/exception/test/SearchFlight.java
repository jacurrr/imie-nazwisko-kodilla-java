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
        boolean result = false;
        for (Map.Entry<String, Boolean> entry : availableAirport.entrySet()
             ) {
            if(entry.getKey() == flight.getArrivalAirport()){
                result = true;
                return entry.getValue();
            }
        }
        if(!result) throw new RouteNotFoundException();
        return false;
    }
}
