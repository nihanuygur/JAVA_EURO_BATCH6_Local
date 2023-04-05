package days.day59_Interface_Enums.Enums;

import days.day59_Interface_Enums.Cars.Honda;
import days.day59_Interface_Enums.Cars.Toyota;
import days.day59_Interface_Enums.N;

public class TestB {
    public static void main(String[] args) {

//        B b=new B(); // B -> interface, not possible to creating new object from interface
            N n = new N();
            n.printB();
        System.out.println("N.city = " + N.city); // we can call attributes implemented class name  or  interface name B
        Toyota toyota= new Toyota();
        toyota.sweepInside();
        toyota.washTheCar();
        Honda honda = new Honda();
        honda.sweepInside();
        honda.washTheCar();
        System.out.println("honda.hp = " + honda.hp);
        System.out.println("honda.model = " + honda.model);


    }
}
