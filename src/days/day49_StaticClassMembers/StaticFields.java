package days.day49_StaticClassMembers;

public class StaticFields {


    ////////////////// DATA FIELDS /////////////////

    int instanceInt; // belongs to the object

    public static  int classInt; // global variable

    static int test;
    public static int orderNumber;  // belongs to the object

    ////////////////// BLOCKS /////////////////
    {
        //instance block
    }
    static{
        //  static method
    }

    ///////////////// METHODS /////////////////

    public static void main(String[] args) {
        int localInt;
        // static int test; ERROR!
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber); // 0
        StaticFields obj = new StaticFields(1);
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber);  // 11
        System.out.println("obj.orderNumber = " + obj.orderNumber);

        orderNumber=22;
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber); // 22
        System.out.println("obj.orderNumber = " + obj.orderNumber); // 22

        StaticFields obj2 = new StaticFields(1);
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber); // 11
        System.out.println("obj.orderNumber = " + obj.orderNumber); // 11
        System.out.println("obj2.orderNumber = " + obj2.orderNumber); // 11
    }

    public StaticFields(int instanceInt){ // constructor
        // static int test; ERROR!
        orderNumber = 11;
        this.instanceInt = instanceInt;
    }
    public void test(){
        // static int test; ERROR!
    }
    public void createInvoice(){
        //
        //
        //
        // system create an unique inv number
        // need to store it!!
        int orderNumber=12345134;

    }
    public void verifyOrderWithNumber(){
        // use filter option and enter order number !!
    }

    public void deleteOrder(){ //rollBack
        //        orderNumber -- you can't call it in here!
    }
    static {
        //        orderNumber -- you can't call it in here!
    }
}
