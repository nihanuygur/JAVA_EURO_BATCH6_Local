package days.day58FarukT.animals;

public abstract class Animal {
    String name;

    Animal() {
        System.out.println("an animal object created.");
    }

    Animal(String name) {
        this.name = name;
        System.out.println("an animal object created.");
    }

    public void eating() {
        System.out.println("animal is eating");
    }

    public abstract void moving();
}
