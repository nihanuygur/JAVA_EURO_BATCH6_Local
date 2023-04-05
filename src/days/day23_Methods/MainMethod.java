package days.day23_Methods;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("in the real main method");
        main("hello");

    }
    static void  main(String str){ //for main method overloading is possible.
        System.out.println("overloaded main method");
    }
}
