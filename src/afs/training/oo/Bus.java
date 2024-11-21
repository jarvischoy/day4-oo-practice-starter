package afs.training.oo;

public class Bus extends Vehicle {
    private final Integer ACCELERATION = 5;

    public Bus(String name, Integer speed) {
        super(name, speed);
        acceleration = ACCELERATION;
    }
}
