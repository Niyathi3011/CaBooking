package Data;

import DataOrder.Trip;

import java.util.*;

public class DriverCustomerAverage {

    static Map<String, List<Double>> driverRatings = new HashMap<>();
    static Map<String, List<Double>> customerRatings = new HashMap<>();

    public static void averageRatings(List<Trip> tripList) {

        for (Trip trip : tripList) {

            if (!driverRatings.containsKey(trip.getDriver().getName()))
                driverRatings.put(trip.getDriver().getName(), new ArrayList<>());
                driverRatings.get(trip.getDriver().getName()).add(trip.getDriver().getRating());


            if (!customerRatings.containsKey(trip.getCustomer().getName()))
                customerRatings.put(trip.getCustomer().getName(), new ArrayList<>());
                customerRatings.get(trip.getCustomer().getName()).add(trip.getCustomer().getRating());

        }
    }
}
