package days.day44;

public class PassingObjToMethod {
    public static void main(String[] args) {
        Circle c = new Circle(1);
        printAllInfoOfCircle(c);
    }

    public static void printAllInfoOfCircle(Circle circle){
        System.out.println("Area of given circle is "+ (circle.getArea()) + " and delimiter of circle is "+ circle.delimiter());
    }
}

class Circle {
    double radius;
public Circle(double radius){
    this.radius = radius;
}
    public double getArea() {
        return Math.PI * radius * radius; // Math.PI
    }

    public double delimiter() {  // Math.PI
        return 2 * Math.PI * radius;
    }

}