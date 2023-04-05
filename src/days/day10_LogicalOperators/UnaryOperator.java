package days.day10_LogicalOperators;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 40;
        ++a; // preincrement
        System.out.println("a = " + a); //41
        a++; // postincrement
        System.out.println("a = " + a); //42
        --a; // predecrement
        System.out.println("a = " + a); //41
        a--; // postdecrement
        System.out.println("a = " + a); //40

        int b = a; // b = 40
        System.out.println("b = " + b);
        int c = --a; // c and a values will be 39
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        a = 40;
        int d = a --; // decrement will not effect value of d, so it will be 40
        System.out.println("d = " + d);
        System.out.println("a = " + a);
        a = 10;
        int number = a++ + a + a++; // 10 + 11 + 11
        System.out.println("number = " + number);
        System.out.println("a = " + a); // 12
        System.out.println(a-- + --a + a++); // 12 + 10 + 10

        ////// it is a good example for postcrement or postincrement:

        for(int i=1; i<5; i++) {
            System.out.println("2 times " + i + " = " + i * 2);
        }




    }
}
