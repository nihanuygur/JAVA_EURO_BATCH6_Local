package days.day53_Inheritance;

import days.day52FarukT.C;

public class Car extends Vehicle {
    int door;
    String fuelType;
    String gearBox; // Manual
    String brand;

    Car(String brand){
        super(brand);
        this.brand=brand;
    }

}
