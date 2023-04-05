package days.day50_StaticClassMembers;

public class Test {

    int testNumber;
    static String testName;

    public Test(int testNumber){
        this.testNumber=testNumber;
        testName = "Constructor Static Assignment";
        System.out.println("testName in Cons= " + testName);
    }

    static { // Compiler will run first static block
        System.out.println("HELLO FROM DIFFERENT TEST CLASS STATIC BLOCK");
        System.out.println("testName before initializing = " + testName);
        testName = "Static Block Test";
        System.out.println("testName after initializing = " + testName);


    }
}
