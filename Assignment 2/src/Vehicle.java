
package vms;

public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    void displayDriverSummaryIfPresent() {
        if (driver != null) {
            System.out.println("Assigned Driver: " + driver.getName() + " | License: " + driver.getLicenseNumber());
        } else {
            System.out.println("No driver assigned.");
        }
    }

    public void displayDriverInfo() {
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("Driver info: none");
        }
    }
}