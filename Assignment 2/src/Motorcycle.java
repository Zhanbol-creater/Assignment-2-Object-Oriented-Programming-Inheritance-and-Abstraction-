
package vms;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started: " + brand + " (" + year + ")" + (hasSidecar ? " with sidecar" : ""));
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped: " + brand);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle | Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}