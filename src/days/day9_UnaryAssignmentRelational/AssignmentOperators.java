package days.day9_UnaryAssignmentRelational;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a;
        a = 20; // = assignment operator
        a = a + 10; // swapping
        System.out.println("a = " + a);
        a += 10; // a = a + 10
        System.out.println("a = " + a);
        a = a - 20;
        a -= 10; // a= a-10
        System.out.println("a = " + a);
        a = a * 10; // 10*10 a ---> 100
        a *= 5; // a=100*5 ---> a +500
        System.out.println("a = " + a);
        a /= 20; // a = 500 / 20 ---> 25
        System.out.println("a = " + a);
        a %= 3; // 25/ 3 --> remainder is 1
        System.out.println("a = " + a);


    }
}
