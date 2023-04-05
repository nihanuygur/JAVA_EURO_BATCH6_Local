package days.day61_Polymorphism;

public class CarTest {
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.moving();
        honda.breaks();
        Car car=new Car();
        car.moving(); // Car is moving
        car=new Honda();
        car.moving(); // Honda is moving
    }
}
