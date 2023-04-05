package days.day53_Inheritance;

import days.day54_AccessModifiers.AccessModifier;
import days.day54_AccessModifiers.TestInh;

public class TestInhOut extends AccessModifier {

    public static void main(String[] args) {

        TestInh obj1Child = new TestInh();
//        obj1Child.password // PRIVATE !!

        AccessModifier obj2Parent = new AccessModifier(); // -->PARENT
//        obj2Parent.password // PRIVATE !!
//        obj2Parent.isActive; // PROTECTED no access !!

        TestInhOut objInhOut = new TestInhOut(); // --> CHILD !
        objInhOut.isActive=false;
        objInhOut.testOverriding();
    }


    public void testOverriding() {
//        super.testOverriding();
        System.out.println("Child class");
    }

}
