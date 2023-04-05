package days.day22_Methods;

public class PrintClass {
    public static void main(String[] args) {
//        printName(); we can not call nonstatic methods in static main method.
    }

    public void printName(){  //In this method we can call other nonstatic methods.
        System.out.println("Ronaldo");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
