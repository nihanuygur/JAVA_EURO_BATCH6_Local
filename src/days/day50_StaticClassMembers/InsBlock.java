package days.day50_StaticClassMembers;

public class InsBlock {

    //////////////////////////////// DATA FIELDS ////////////////////////////////

    int value;
    static String text;


    //////////////////////////////// BLOCKS ////////////////////////////////

    {
        // non-static block (Instance block) when the object is created. Because it
        System.out.println("--------Instance Block--------");
    }

    static {
        System.out.println("--------Static Block--------");
    }

    //////////////////////////////// METHODS ////////////////////////////////
    public static void main(String[] args) {
        System.out.println("\t -- Main method first line");

        InsBlock obj = new InsBlock(); // with declaration instance block will be executed
        System.out.println("obj = " + obj);

        InsBlock obj1 = new InsBlock(); // with declaration instance block will be executed
        System.out.println("obj1.value = " + obj1.value);
        
        System.out.println("\t -- Main method last line");
    }

    public void test(){
        System.out.println("Test Method");
    }

}
