import Data.DriverCustomerAverage;
import Data.EligibleDrivers;
import DataOrder.Trip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Trip>tripList=DummyData.getData();

    public static void main(String[] args) {


        String customersName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customers name");
        customersName = sc.nextLine();

        EligibleDrivers.averageRatings(tripList);
        EligibleDrivers.eligibleDrivers(customersName,tripList);

    }
}
