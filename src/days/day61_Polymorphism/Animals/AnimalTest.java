package days.day61_Polymorphism.Animals;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog=new Dog();
        dog.makeSound();

        Animal animal1=new Cat(); // Cats are meowing
        animal1.makeSound();
        Animal animal2=new Dog();
        animal2.makeSound(); // Dogs are hav
        System.out.println("cat.city = " + cat.city); //Oslo
        Animal animal3= new Animal();
        System.out.println("animal3.city = " + animal3.city);
        Animal animal4= new Cat();
        System.out.println("animal4.city = " + animal4.city);

        dog.name="King";
        cat.name="Ginger";

        printCatName(cat);
        printDogName(dog);
        printName(cat);
        printName(dog);

        ArrayList <String>cities= new ArrayList<>();
        ArrayList <Cat>listOfCat= new ArrayList<>();
        listOfCat.add(cat);
        Cat cat1=new Cat();
        listOfCat.add(cat1);

        ArrayList <Dog>listOfDog= new ArrayList<>();
        listOfDog.add(dog);
        Dog dog1=new Dog();
        listOfDog.add(dog1);
        ArrayList <Animal>listOfAnimal= new ArrayList<>(); // Polymorphism
        listOfAnimal.add(dog);
        listOfAnimal.add(cat1);

        for (Animal animal5 : listOfAnimal) {
            System.out.println("Animals name ; " + animal5.name);

        }



    }
    static void printCatName(Cat c){
        System.out.println("c.name = " + c.name);
    }
    static void printDogName(Dog d){
        System.out.println("d.name = " + d.name);
    }
    static void printName(Animal animal){  // Polymorphism // pass super class call sub-classes // up casting
        System.out.println("animal.name = " + animal.name);
    }
}
