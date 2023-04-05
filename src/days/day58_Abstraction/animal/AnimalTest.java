package days.day58_Abstraction.animal;

public class AnimalTest {
    public static void main(String[] args) {
        //    Animal animal = new Animal()
//            animal.eating;  Animal class abstract so we cant create any object from this class
        Cat cat = new Cat();
        cat.moving();
        Dog dog = new Dog();
        dog.moving();
        Cat cat2 = new Cat("Ginger");

    }
}
