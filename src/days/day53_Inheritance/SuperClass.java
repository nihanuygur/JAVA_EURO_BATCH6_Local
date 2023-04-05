package days.day53_Inheritance;

public class SuperClass {
    int num = 50;
    SuperClass(){
        System.out.println("Obj  created from SuperClass");
    }
    public void print(){
        System.out.println("Parent class print method");
        System.out.println("this.num = " + this.num);
    }
}
