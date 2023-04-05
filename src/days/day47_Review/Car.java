package days.day47_Review;

public class Car {
    String brand;
    String color;
    String plateNumber;
    String model;
    double value;
    int speed;
    int year;
    int doors;
    Car(){

    }
    Car(String brand, String color, String plateNumber, String model, double value, int year, int doors) {
        this.brand = brand;
        this.color = color;
        this.plateNumber = plateNumber;
        this.model = model;
        this.value = value;
        this.year = year;
        this.doors = doors;
    }

    public void accelerating(){
        speed+=10;
    }
    public void breaks(){
        speed-=5;
    }
}
