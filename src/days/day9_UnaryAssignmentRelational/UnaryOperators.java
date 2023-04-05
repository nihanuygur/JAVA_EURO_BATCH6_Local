package days.day9_UnaryAssignmentRelational;

public class UnaryOperators {
    public static void main(String[] args) {

        int a;
        a = 10;
        System.out.println("a = " + a);
        ++a; // 10 +1 preincrement
        System.out.println("a = " + a);
        ++a; // 12
        System.out.println("a = " + a);
        a++; // 13 postincrement
        System.out.println("a = " + a);
        a++; // 14
        System.out.println("a = " + a);
        int b = a;
        System.out.println("b = " + b);
        b = ++a; //increase the value of a will assign to b
        System.out.println("a = " + a);
        b = a ++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

       ///////////////

        int a2 = 10;
        --a2;// predecrement
        System.out.println("a2 = " + a2);//9
        a2--;// postdecrement
        System.out.println("a2 = " + a2);//8
        int b2 = a2;
        System.out.println("b2 = " + b2);
        a2 = --b2;// b2 and a2 7
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        a2 = b2--;// before assignment a2 is 7 b2 is 7 after assignment  a2 still 7 but b2 is 6
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        a2 = 10;
        System.out.println(--a2);// 9
        System.out.println("a2-- = " + a2--);// 9
        System.out.println("a2 = " + a2);//8

    }
}
