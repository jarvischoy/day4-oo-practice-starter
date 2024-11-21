package afs.training.oo;

public class Truck extends Vehicle{
    private final Integer ACCELERATION = 2;

    public Truck(String name, Integer speed) {
        super(name, speed);
        acceleration = ACCELERATION;
    }
}
