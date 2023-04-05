package days.day59_Interface_Enums.Cars;


public class Honda extends Car implements CleaningTheCar,ModifyTheCar {

    enum Models{
        ACCORD, JAZZ, CIVIC;
    }
    public int hp=100;
    public Models model =Models.ACCORD; // it means all cars which are created from Honda class are Accord
    @Override
    public void washTheCar() {
        System.out.println("washing the car in the station");
    }

    @Override
    public void sweepInside() {
        System.out.println("hired someone to cleaning the car");
    }

    @Override
    public void boostThePower() {
        hp=hp+200;
    }

    @Override
    public void changeTheTyres() {

    }
}
