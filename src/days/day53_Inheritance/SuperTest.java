package days.day53_Inheritance;

public class SuperTest {
    public static void main(String[] args) {
        SuperClass superClass=new SuperClass();
        ChildClass childClass = new ChildClass();
        System.out.println(childClass instanceof SuperClass);

    }
}
