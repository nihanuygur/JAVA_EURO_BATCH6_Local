package days.day44;

public class ConstructorBase {
    int value;

    String str;

    boolean flag;

    double rate = 4.0;
    static int objectCounter = 0; //  should be keep the object number dynamically

    // RULES:
    // 1- Don't type a return type
    // 2- Constructor name must be same with Class name
    public ConstructorBase() { // Default contractor !!
        rate = 1.1;
        flag = true;
        objectCounter++;
    }

    public void ConstructorBase() { // a method ..  !!

    }


    public void test() {

    }
}

class TestConst {
    public static void main(String[] args) {

        System.out.println("BEGIN - Main Method");
        ConstructorBase obj1 = new ConstructorBase();
        System.out.println("obj1 Created ! !");
        System.out.println("ConstructorBase.objectCounter = " + ConstructorBase.objectCounter);

        System.out.println("obj1.value = " + obj1.value);
        System.out.println("obj1.flag = " + obj1.flag);
        System.out.println("obj1.rate = " + obj1.rate);
        System.out.println("obj1.str = " + obj1.str);

        ConstructorBase obj2 = new ConstructorBase();
        System.out.println("obj2 Created ! !");
        System.out.println("ConstructorBase.objectCounter = " + ConstructorBase.objectCounter);

        System.out.println("obj2.value = " + obj2.value);
        System.out.println("obj2.flag = " + obj2.flag);
        System.out.println("obj2.rate = " + obj2.rate);
        System.out.println("obj2.str = " + obj2.str);

        System.out.println("END - Constructor ! !");



    }

}
