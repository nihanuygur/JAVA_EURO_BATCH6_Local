package days.day59_Interface_Enums;

public class N implements B,D {
    // a class can 'implement' multiple interface


    @Override
    public void printB() {
        System.out.println("Print child class");
    }
}
