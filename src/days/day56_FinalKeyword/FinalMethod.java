package days.day56_FinalKeyword;

public class FinalMethod { // we can just use public or default access modifier with class



    final public void testFinal(){

    }
//    private void testFinal(){     if we make it private, we can't reach and access the method,
//                                       but with final keyword, it avoids overriding
//
//    }
}
class FinalTest extends FinalMethod{

//    public void testFinal(){ //can't override with final method

//    }

    public static void main(String[] args) {
        FinalMethod obj = new FinalTest();
        obj.testFinal(); // if we make it private, we can't reach and access the method,
        // but with final keyword, it avoids overriding
    }
}