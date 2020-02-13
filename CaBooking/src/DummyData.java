import DataOrder.Customer;
import DataOrder.Trip;
import DataOrder.Driver;

import java.util.ArrayList;
import java.util.List;

public class DummyData {

    public static List<Trip> getData() {

        List<Trip> tripList = new ArrayList<>();

        tripList.add(new Trip(new Driver("d1", 4.0), new Customer("c1", 5.0)));
        tripList.add(new Trip(new Driver("d1", 5.0), new Customer("c2", 4.0)));
        tripList.add(new Trip(new Driver("d1", 1.0), new Customer("c3", 2.0)));
        tripList.add(new Trip(new Driver("d2", 5.0), new Customer("c1", 1.0)));
        tripList.add(new Trip(new Driver("d2", 5.0), new Customer("c2", 5.0)));
        tripList.add(new Trip(new Driver("d2", 4.0), new Customer("c3", 5.0)));
        tripList.add(new Trip(new Driver("d3", 3.0), new Customer("c1", 2.0)));
        tripList.add(new Trip(new Driver("d3", 4.0), new Customer("c2", 5.0)));
        tripList.add(new Trip(new Driver("d3", 3.0), new Customer("c3", 3.0)));

        return tripList;
    }

}