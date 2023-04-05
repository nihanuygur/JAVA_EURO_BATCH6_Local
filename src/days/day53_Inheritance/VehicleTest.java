package days.day53_Inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Volvo");
        car.start();
        car.move();
        car.stop();
        Bicycle bicycle = new Bicycle();
        bicycle.start();
        car.door=4;
        car.fuelType="Gasoline";
    }
}
