package days.day28_Week6_7Review_PracticeQuiz1;

public class sdwa {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.print(i + " " + j);
            }}
        int b=2;

        boolean bol= - ++b == - 2 || b++ == --b ^ b++ == 3 ;

        System.out.print(b);
        System.out.print(bol);

        int x = 10;
        int y = 15;
        System.out.print(x > y || x == ++y);
        System.out.print(x < y || x == ++y);
        System.out.print(x < y && x++ == y);
    }
}
