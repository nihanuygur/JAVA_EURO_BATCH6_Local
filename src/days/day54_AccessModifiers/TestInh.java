package days.day54_AccessModifiers;

import days.day53_Inheritance.TestInhOut;

public class TestInh extends AccessModifier {
    public static void main(String[] args) {

        TestInh obj1Child = new TestInh(); // --> CHILD !
//        obj1Child.password

        AccessModifier obj2Parent = new AccessModifier();
//        obj2Parent.password
    }

}
