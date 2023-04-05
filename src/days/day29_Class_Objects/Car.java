package days.day29_Class_Objects;

public class Car {
    String color;
    String brand;
    int year;
    int doorNumber;
    int speed;

    public void moving() {
        System.out.println("car is moving.");
        System.out.println("car's initial speed is = " + speed + " .");
    }

    public void breaks() {
        speed -= 20;
        System.out.println("car is getting slower.");
        System.out.println("after breaks the new speed of " + brand + " is = " + speed);
brand.toUpperCase();

    }

    public void stops() {
        System.out.println("car stopped");
    }

    public void accelerating() {
        speed += 30;
        System.out.println("now the new speed of " + brand + " is = " + speed);
    }
}
