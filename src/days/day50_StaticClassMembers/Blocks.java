package days.day50_StaticClassMembers;

public class Blocks {

    static  int test ;

    public static void staticTest(){
        System.out.println("!! Static Method !!");
    }

    public void test(){
        System.out.println("!! Non Static Method !!");
    }


    public static void main(String[] args) { // Compiler will run second static block

        // test(); no access to non-static methods
        System.out.println("test = " + test);
        test = 3;
        System.out.println("test = " + test);
        System.out.println("\t -- MAIN METHOD First Line --");

        staticTest();


        Blocks obj =new Blocks();
        obj.test();

        Test testObj = new Test(49);
        System.out.println("\t -- MAIN METHOD Last Line --");


    }


    static { // Compiler will run first static block and just one time will run
        test = 2;
        System.out.println("\t __ Static Block __ ");
    }


//    static { // There is no error, no limitation to creating static block, but one is enough
//        System.out.println("\t __ Static Block __ ");
//        test = 5;
//    }

}
