package days.group1Tasks.Abstraction;

public class Samsung extends Phone{

    @Override
    public void takePhoto() {
        System.out.println("Samsung takes photos");
    }

    @Override
    public void playGame() {
        System.out.println("You can play game with Samsung");
    }
}
