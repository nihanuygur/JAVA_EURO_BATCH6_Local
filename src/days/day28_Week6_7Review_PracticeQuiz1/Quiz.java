package days.day28_Week6_7Review_PracticeQuiz1;

public class Quiz {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = a + b;

        for (int i = 0; i < 3; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        System.out.println("c = " + c);

        int i = 0;
        outer:
        do {
            i = 8;
            inner:
            while (true) {
                System.out.print(i--);
                if (i == 4) {
                    break;
                }
            }
        } while (false);

    }

}
