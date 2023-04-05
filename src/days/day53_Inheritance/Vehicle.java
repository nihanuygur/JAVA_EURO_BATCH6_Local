package days.day53_Inheritance;

public class Vehicle {
    // parent class
    int weight;
    private String name;
    float length;
    int seats;
    boolean lights;
    String color;

    Vehicle(String name) {
        this.name = name;
    }

    Vehicle() {

    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

}
