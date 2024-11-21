package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus coolBus = new Bus("Cool Bus", 25);
        Driver busDriver = new Driver(coolBus);

        Truck bigTruck = new Truck("Big Truck", 20);
        Driver truckDriver = new Driver(bigTruck);

        busDriver.drive();
        truckDriver.drive();
    }
}