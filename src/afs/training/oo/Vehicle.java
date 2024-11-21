package afs.training.oo;

public class Vehicle {
    protected String name;
    protected Integer speed;
    protected Integer acceleration;

    public Vehicle(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(){
        speed += acceleration;
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}
