package days.day53_Inheritance.animal;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("Dog is barking");
        System.out.println("super.getName() = " + super.getName());
    }
}
