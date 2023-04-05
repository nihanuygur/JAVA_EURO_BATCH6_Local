package days.day53_Inheritance.animal;

public class Animal {
    private String name;
    int age;

    Animal(String  name){
        this.name=name;
        System.out.println("Animal's name is " + name);
    }
    public void moving(){
        System.out.println("Animals are moving");
    }
    public void eating(){
        System.out.println("Animals eat");

    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("Animals make sound");
    }
}
