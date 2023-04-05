package days.day54_AccessModifiers;

public class Test1 {
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();
        System.out.println("obj1.value = " + obj1.value);


//        System.out.println("obj1.password = " + obj1.password);

        obj1.setPassword("NewPassword");
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        obj1.pageElement = "test1";
        System.out.println("obj1.pageElement = " + obj1.pageElement);

        System.out.println("obj1.isActive = " + obj1.isActive); // protected -- but -> same packages
    }
}
