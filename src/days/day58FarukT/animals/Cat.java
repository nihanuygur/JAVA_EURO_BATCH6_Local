package days.day58FarukT.animals;

public class Cat extends Animal {


    Cat(String name) {
        super(name);
    }

    Cat() {
        super();
    }


    @Override
    public void moving() {
        System.out.println("cats are walking.");
    }
}
