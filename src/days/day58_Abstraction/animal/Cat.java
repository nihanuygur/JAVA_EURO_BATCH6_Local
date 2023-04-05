package days.day58_Abstraction.animal;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    Cat() {
    }

    @Override
    public void moving() {
        System.out.println("Cat is walking");
    }
}
