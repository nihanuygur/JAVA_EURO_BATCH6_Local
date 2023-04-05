package days.day56_FinalKeyword;

public class TestHiding extends HidingFields{ //CHILD CLASS
    // my father's money my money, and also my money is my money. ( for hiding:) )

    int childValue;
    int count; // hiding

    public  TestHiding(){
        count=222;
    }

    public static void main(String[] args) {
        TestHiding testHiding = new TestHiding();
        System.out.println("testHiding.parentValue = " + testHiding.parentValue);
        testHiding.test(); //
        testHiding.count=333;
        System.out.println("testHiding.count = " + testHiding.count);

        testHiding.verify(); // this will get line 22

        HidingFields hidingFields=new HidingFields();
        System.out.println("hidingFields.count = " + hidingFields.count);
        hidingFields.verify();

    }
    public void  test(){
        System.out.println("childValue = " + childValue);
    }
    public void verify(){ // hiding overriding method
        System.out.println("Child verify");
    }
}
