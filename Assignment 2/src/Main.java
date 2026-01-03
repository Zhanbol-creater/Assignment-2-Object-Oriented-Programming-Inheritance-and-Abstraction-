
package vms;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4, "Petrol");
        Motorcycle moto = new Motorcycle("Yamaha", 2018, true);
        Truck truck = new Truck("Volvo", 2022, 18.5, 4);

        Driver alice = new Driver("Alice", "KZ-12345");
        Driver bob = new Driver("Bob", "KZ-98765");

        car.assignDriver(alice);
        moto.assignDriver(bob);
        truck.assignDriver(alice);

        Vehicle[] fleet = new Vehicle[] { car, moto, truck };

        for (Vehicle v : fleet) {
            v.startEngine();
            v.displayInfo();
            v.displayDriverInfo();
            v.displayDriverSummaryIfPresent();
            v.stopEngine();
            System.out.println("----");
        }
    }
}