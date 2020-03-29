package com.kodilla.exception.main;


import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;
import com.kodilla.exception.test.SearchFlight;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
        SearchFlight searchFlight = new SearchFlight();
        boolean result;
        try {
            result = searchFlight.findFlight(new Flight("London","Warszawa"));
            if(result) {
                System.out.println("Flight is available.");
            }else {
                System.out.println("Flight isn't available.");
            }
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End task.");
        }
    }
}
