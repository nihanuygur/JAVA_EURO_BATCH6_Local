package days.day15_TernaryOperator;
public class TernaryOperator {
    public static void main(String[] args) {
        int x,y;
        x=20;
        y = (x==1) ?61 :90;
        System.out.println("y = " + y);

        y = (x==20) ? 61 : 90;
        System.out.println("y = " + y);

        int number = -10;
        System.out.println((number >= 0) ? "Positive" : "Negative");
        String result = (number >= 0) ? "Positive" : "Negative";
        System.out.println("result = " + result);

        double hour = 40;
        double salary = 1000;
        double finalSalary = (hour >= 30) ? salary*2 : salary;
        System.out.println(finalSalary);


        /////////////// NESTED TERNARY OPERATOR

        int n1 = 12 , n2 = 9 , n3 = 30;
        //nested ternary operator to find the largest
        int largest = (n1>n2) ? ( (n1>n3) ? n1 :n3 ) : ( (n2> n3) ? n2 : n3 );
//                   condition    ----- true -----        ----- false -----

        System.out.println("largest = " + largest);



        



    }
}
