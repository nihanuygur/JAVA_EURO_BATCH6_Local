package days.day53FarukT;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Car");
        car.start();
        car.move();
        car.stop();
        Bicycle bicycle = new Bicycle();
        bicycle.start();
        car.fuelType = "Bensin";
        System.out.println("car.name = " + car.name);
        //  Vehicle vehicle = new Vehicle(1);


    }
}
