package DataOrder;

public class Trip {

    private Driver driver;
    private Customer customer;

    public Trip(Driver driver, Customer customer) {
        this.driver = driver;
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public Customer getCustomer() {
        return customer;
    }
}
