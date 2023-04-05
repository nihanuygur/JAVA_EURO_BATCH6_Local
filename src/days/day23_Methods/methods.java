package days.day23_Methods;

public class methods {
    public static void main(String[] args) {
        printRonaldo();
        printMessi();
        printName("Ali");
        doubleN(100);

    }

    public static void printRonaldo() {
        System.out.println("Ronaldo");
    }

    public static void printMessi() {
        System.out.println("Messi");
    }

    public static void printName(String name) { // we can add parameter for methods.
        System.out.println("name = " + name);
    }
    public static  void doubleN (double n){ // if we use parameter method, 
        // it will take the value from main method, but if we declare inside of block again it can change.
        System.out.println("n = " + n);
        n=20;
        System.out.println("n = " + n);
    }

}
