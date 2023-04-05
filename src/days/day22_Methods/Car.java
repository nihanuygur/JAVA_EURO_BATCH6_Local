package days.day22_Methods;

public class Car {
    public static void main(String[] args) {
//        System.out.println("Get the keys");
//        System.out.println("Open the doors");
//        System.out.println("Sit on to the driver seat");
//        System.out.println("Fasten your seat belt");
//        System.out.println("Start the car");
//        System.out.println("Drive the car forward");

        carForward();  // 1
        stopTheCar();  // 2
        carBackward(); // 3

    }
    public static void keys() {
        System.out.println("Got the keys");
    }
    public static void doors() {
        System.out.println("Opened the doors");
    }
    public static void driverSeat() {
        System.out.println("you are on the driver seat");
    }
    public static void seatBelt() {
        System.out.println("Fastened the seat belt");
    }
    public static void startCar() {
        System.out.println("Started the car");
    }
    public static void driveCarForward() {
        System.out.println("Ready to Drive the car forward");
    }
    public static void driveCarBackyard() {
        System.out.println("Ready to Drive the car Backward");
    }
    public static void driverSeat_seatBelt() {
        driverSeat();
        seatBelt();
    }
    public static void carForward() {
        keys();
        doors();
        driverSeat_seatBelt();
        startCar();
        driveCarForward();
    }
    public  static  void stopTheCar(){
        System.out.println("Pushed the brakes");
    }
    public static void carBackward() {
        keys();
        doors();
        driverSeat_seatBelt();
        startCar();
        driveCarBackyard();
    }

}
