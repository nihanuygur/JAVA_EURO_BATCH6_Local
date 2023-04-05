package days.day10_LogicalOperators;

public class logicalOperators {
    public static void main(String[] args) {

        /// || OR  ---> one of the conditions is true, it is enough to be true

        // weekend --->   saturday      tuesday         wednesday
        // or ||
        // >20 C   --->     25             30               15
        // result  --->    true          true              false


        /// && AND ---> all of the conditions must be true !

        // weekend --->   saturday      tuesday          wednesday
        // and &&
        // >20 C   --->     25             30                15
        // result  --->    true          false             false

        System.out.println(3 > 2 && 5 > 2);
        //                  true && true  ---> true
        System.out.println(3 > 2 && 5 > 8);
        //                  true && false ---> false
        System.out.println(3 > 5 && 5 > 8);
        //                 false && false ---> false

        System.out.println(3 > 2 || 5 > 2);
        //                  true && true  ---> true
        System.out.println(3 > 2 || 5 > 8);
        //                  true && false ---> true
        System.out.println(3 > 5 || 5 > 8);
        //                 false && false ---> false

        boolean isWeekend;
        boolean isWhetherOver20;
        isWeekend = true;
        isWhetherOver20 = false;
        System.out.println(isWeekend && isWhetherOver20); // if we use  && --> it will control until finding false.
                                        // if it finds false at first statement, it will not look rest of conditions
        System.out.println(isWeekend & isWhetherOver20); // if we use one & --> it will control until finding false.

        int a = 20;
        System.out.println( 20> 3 && a > 10);
        System.out.println( 20> 3 && ++a > 10);
        System.out.println("a = " + a);
        System.out.println( 20< 3 && ++a > 10); // it found false, so it didn't control the next condition
        System.out.println("a = " + a);
        System.out.println( 20< 3 & ++a > 10); // it completed to control all conditions
        System.out.println("a = " + a);

    }
}
