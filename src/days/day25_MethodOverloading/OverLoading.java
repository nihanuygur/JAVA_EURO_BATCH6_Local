package days.day25_MethodOverloading;

public class OverLoading {
    public static void main(String[] args) {
        add(10, 20);
        add(10.5, 20.5);
    }

    public static void add(int a, int b) {
        System.out.println("a+b = " + (a + b));

    }

    public static void add(double a, double b) { //first rule of overloading is changing data types. (same method name)
        System.out.println("a+b = " + (a + b));

    }

    public static void add(int a, int b, int c) { //second; we can change number of parameters.(same method name)
        System.out.println("a+b+c = " + (a + b + c));

    }
    public static void add(String a, int b) {// third; order of parameters.(same method name)
        System.out.println("a" + b);

    }
    public static void add(int b, String a) {
        System.out.println("a" + b);

    }
}
