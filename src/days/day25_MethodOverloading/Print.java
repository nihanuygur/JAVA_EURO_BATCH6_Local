package days.day25_MethodOverloading;

public class Print {
    public static void main(String[] args) {
        print();
        print(5);
        print("Ronaldo");
        print("Ronaldo", 37);
        print("Ronaldo", "Messi");
        print(10, 20);
        print(20, 35); //double
    }


    public static void print() {
        System.out.println("Without parameter");
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(String a) {
        System.out.println(a);
    }

    public static void print(String a, int b) {
        System.out.println(a + " , " + b);
    }

    public static void print(String a, String b) {
        System.out.println(a + "," + b);
    }

    public static void print(int a, int b) {
        System.out.println(a + "," + b);
    }

    //    public static int print(int a, int b) {
//        System.out.println(a + "," + b);
//    }
    public static void print(double a, double b) {
        System.out.println(a + "," + b);
    }
}
