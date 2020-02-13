package Data;

import DataOrder.Driver;
import DataOrder.Trip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import static Data.Average.average;

public class EligibleDrivers extends DriverCustomerAverage {

    static List<Driver> driverList = new ArrayList<>();
    static double avgRating = 0;

    public EligibleDrivers() {
        super();
    }

    public static void eligibleDrivers(String customersName, List<Trip> trips) {

        if (customerRatings.containsKey(customersName))
            avgRating = average(customerRatings.get(customersName));

        for (String name : driverRatings.keySet()) {
            if (average(driverRatings.get(name)) >= avgRating )
                driverList.add(new Driver(name, average(driverRatings.get(name))));
        }

        for (Trip trip : trips) {
            if (driverList.isEmpty())
                if (trip.getCustomer().getName().equals(customersName)&&(trip.getDriver().getRating()!=1)) {
                    driverList.add(new Driver(trip.getDriver().getName(), average(driverRatings.get(trip.getDriver().getName()))));
                }
        }

        displayList();

    }

    public static void displayList() {

        System.out.println("Average Rating of Customers is " + avgRating);
        System.out.println("List of eligible drivers is : ");
        for (Driver driver : driverList)
            System.out.println("DriversName : " + driver.getName() + " DriversRating : " + driver.getRating());
    }
}
