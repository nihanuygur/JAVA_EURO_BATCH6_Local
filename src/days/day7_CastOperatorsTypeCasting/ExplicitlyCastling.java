package days.day7_CastOperatorsTypeCasting;

public class ExplicitlyCastling {
    public static void main(String[] args) {

        double d = 10;
        System.out.println("d = " + d); // 10.0
        int i;
        i = (int) d; // iValue =10; (int) CAST OPERATOR !!
        System.out.println("i = " + i); // we handle exp casting and there was NO data lost !!
        
        //int iValue =(int) dValue;
        //        dValue = 11.3;
        
       // iValue (int)
        int iValue = 100;

        byte bValue = (byte)iValue;
        System.out.println("bValue = " + bValue);

        double dValue = 10.1;

        iValue = (int) (dValue + 10.9);
        iValue = (int) dValue + (int)10.9;


    }
}
