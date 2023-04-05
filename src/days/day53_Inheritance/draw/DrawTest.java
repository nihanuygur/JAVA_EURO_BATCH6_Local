package days.day53_Inheritance.draw;

public class DrawTest {
    public static void main(String[] args) {
        Draw draw =  new Draw();
        draw.drawingShape(); // We are drawing any shape
        Circle circle = new Circle();
        circle.drawingShape();// we are drawing a circle. --> overriding

        // create a circle class in the draw package
        // inherit Draw class from circle class
        // by using circle obj invoke the drawingShape
    }
}
