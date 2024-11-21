package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus coolBus = new Bus("Cool Bus", 25);
        Driver busDriver = new Driver(coolBus);

        Engine gasolineEngine = new GasolineEngine();
        Truck bigGasolineTruck = new Truck("Big Gasoline Truck", 20, gasolineEngine);
        Driver gasolineTruckDriver = new Driver(bigGasolineTruck);

        Engine electricEngine = new ElectricEngine();
        Truck bigElectricTruck = new Truck("Big Electric Truck", 20, electricEngine);
        Driver electricTruckDriver = new Driver(bigElectricTruck);

        busDriver.drive();
        gasolineTruckDriver.drive();
        electricTruckDriver.drive();
    }
}