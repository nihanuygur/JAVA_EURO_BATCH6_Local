package days.day51FarukT;

public class Blocks {
    static {
        System.out.println("static block will be executed");
    }

    {
        System.out.println("instance block will be executed");
    }

    Blocks() {
        System.out.println("constructor executed");
    }

}
