package days.day9_UnaryAssignmentRelational;

public class RelationalOperators2 {
    public static void main(String[] args) {
        int i = 20;
        int l = 30;
        System.out.println(i == l); //  20 == 30
        System.out.println(i == 30); // == not an assignment
        System.out.println("i = " + i);
        System.out.println(i != 20);
        System.out.println(i == 20);
        System.out.println(i > l);
        System.out.println("i<= l = " + (i <= l));
        String str = "i<= l = " + (i <= l) ;
        System.out.println(str);
    }
}
