package days.day14_SwitchCaseStatement;

public class switchCase {
    public static void main(String[] U) {
        int a= 15;
        int b = 20;
        boolean result = true ;
         switch (a) {  //char byte short int String
             case 5:   // use with colon
                 System.out.println("a value is 5");
                 b = 3;
                 break;
             case 15 :
                 System.out.println("a value is 15");
                 b = 6;
                 break;
             case 20:
                 System.out.println("a value is 20");
                 b = 9;
                 break; // break is optional to stop execution.
             default: // optional
                 System.out.println("Neither of the values match with a value");
         }
        System.out.println("out of switch block");
        System.out.println(10/3);

















    }
}
