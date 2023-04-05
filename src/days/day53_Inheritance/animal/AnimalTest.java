package days.day53_Inheritance.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("King");
        dog.eating();
        Cat cat =new Cat("Ginger");
        cat.eating();
        Lion lion = new Lion("Oscar");
        System.out.println("lion.getName() = " + lion.getName());
        lion.makeSound();

    }
}
