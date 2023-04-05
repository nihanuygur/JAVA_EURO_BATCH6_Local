package days.day51_Review;

public class Blocks {
    static {
        System.out.println("Static block is executed");
    }

    {

        System.out.println("Instance block is executed");
    }

    Blocks(){
        System.out.println("constructor is executed");
    }
}
