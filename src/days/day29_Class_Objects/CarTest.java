package days.day29_Class_Objects;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.color = "Blue";
        car1.doorNumber = 4;
        car1.year = 2020;
//        car1.speed=140;
        car1.moving();
        car1.breaks();
        car1.accelerating();
        Car car2= new Car();
        car2.brand ="Toyota";
        car2.speed=5;
        car2.moving();
        System.out.println("car1.speed = " + car1.speed);
        car2.accelerating();
        System.out.println("car2.speed = " + car2.speed);
        car2.breaks();
        Car car3= new Car();
        car3.brand="Honda";
        System.out.println(car1.brand==car3.brand);
    }
}
