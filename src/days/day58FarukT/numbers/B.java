package days.day58FarukT.numbers;

public class B extends A { // child class

    B() {
        super(10);
        System.out.println("super.a5 = " + super.a5);
    }

    @Override
    public void print() {
        System.out.println("B");
    }
}
