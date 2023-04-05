package days.day53_Inheritance.animal;

public class Lion extends Cat {
    Lion(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " is roaring");
    }
}
