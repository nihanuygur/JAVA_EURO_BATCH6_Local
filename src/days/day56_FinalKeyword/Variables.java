package days.day56_FinalKeyword;

public class Variables {
    String strInstance; // instance variable
    boolean isActive;
    static int number ;

public Variables(){

}


    public static void main(String[] args) {
        System.out.println("top of Main Method");

        int num1= 2; // local Variable
        int num2= 20;
        int num3;
        test();
        System.out.println("Variables.number = " + Variables.number);


//        System.out.println("num3 = " + num3);

        num3=3;
        System.out.println("End of Main Method");

        class TestVariable{
            static int count;

            public static void main(String[] args) {
                Variables obj = new Variables();
                System.out.println("obj.isActive = " + obj.isActive);
                System.out.println("count = " + count);
            }
        }







    }

    public static void test(){
        int mnumb1 = 123;
        System.out.println("mnumb1 = " + mnumb1);
    }
}
