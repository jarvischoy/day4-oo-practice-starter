package afs.training.oo;

public class Vehicle {
    private String name;
    private Integer speed;
    private Integer acceleration;

    public Vehicle(String name, Integer speed, Integer acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public void speedUp(){
        speed += acceleration;
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}
