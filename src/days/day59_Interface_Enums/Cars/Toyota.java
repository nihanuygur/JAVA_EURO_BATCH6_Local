package days.day59_Interface_Enums.Cars;

public class Toyota extends Car implements CleaningTheCar,ModifyTheCar{
    @Override
    public void washTheCar() {
        System.out.println("washing car in front of home");
    }

    @Override
    public void sweepInside() {
        System.out.println("cleaning car inside home");
    }

    @Override
    public void boostThePower() {

    }

    @Override
    public void changeTheTyres() {

    }
}
