
package vms;

public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started: " + brand + " (" + year + "), capacity: " + capacity + "t, axles: " + numAxles);
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped: " + brand);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck | Capacity: " + capacity + "t | Axles: " + numAxles);
    }
}