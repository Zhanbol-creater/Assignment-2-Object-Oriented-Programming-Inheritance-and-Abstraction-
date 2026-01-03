
package vms;

public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started: " + brand + " (" + year + "), " + doors + " doors, fuel: " + fuelType);
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped: " + brand);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car | Doors: " + doors + " | Fuel: " + fuelType);
    }
}