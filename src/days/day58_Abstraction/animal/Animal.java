package days.day58_Abstraction.animal;

public abstract class Animal {
    String name;

    Animal() {
        System.out.println("an animal object created");
    }

    Animal(String name) {
        System.out.println("an animal object created");
    }

    public void eating() {
        System.out.println("Animal is eating");
    }

    public abstract void moving();


}
