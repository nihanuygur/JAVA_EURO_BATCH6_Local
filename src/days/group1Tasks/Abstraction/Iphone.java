package days.group1Tasks.Abstraction;

public class Iphone extends Phone{

    @Override
    public void takePhoto() {
        System.out.println("Iphone takes cool photos");
    }

    @Override
    public void playGame() {
        System.out.println("You can play game with Iphone");
    }
}
