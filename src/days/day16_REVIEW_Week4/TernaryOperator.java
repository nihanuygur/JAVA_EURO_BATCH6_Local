package days.day16_REVIEW_Week4;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is bigger than b.");
        } else {
            System.out.println("b is bigger than a.");
        }


        String bigger = (a > b) ? "a is bigger than b." : "b is bigger than a.";
        System.out.println(bigger);

        int c = 65;
        a = 50;
        b = 60;

        int biggest = (a > b && a > c) ? a : (b > c && b > a) ? b : c;
        int biggest2 = (a > b && a > c) ? a : (b > c) ? b : c;

        System.out.println(biggest);
        System.out.println(biggest2);

        biggest = (a > b) ? ((a > c) ? a : (b > c ? b : c)) : ((b > c) ? b : c);

        System.out.println(biggest);


    }
}
