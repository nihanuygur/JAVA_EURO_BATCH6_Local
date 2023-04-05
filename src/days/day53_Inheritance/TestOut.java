package days.day53_Inheritance;

import days.day54_AccessModifiers.AccessModifier;

public class TestOut {
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();

        obj1.value = 1;
//        obj1.pageElement = "ssss"; no access -> default !!
//        Test2 key= new Test2; // no access -> default !!

//        obj1.isActive = false; // no access -> protected !!
    }

}
