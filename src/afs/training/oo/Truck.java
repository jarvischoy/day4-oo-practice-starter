package afs.training.oo;

public class Truck extends Vehicle {

    public Truck(String name, Integer speed, Engine engine) {
        super(name, speed, engine.getAcceleration());
    }
}
