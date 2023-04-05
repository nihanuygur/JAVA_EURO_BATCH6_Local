package days.day21TalhaT;

public class Continue {
    public static void main(String[] args) {
        int number;
        // don't want to use 13 in my calculations...   9 10 11 12 14 15 16
//        for (number = 1; number < 50; number++) {
//            System.out.println(number);
//
//            if (number != 13) {
//                System.out.println(number);
//            }
//            System.out.println(number);
//
//        }


        for (number = 1; number < 15; number++) {

            if (number == 13) {
                continue;
            }
            System.out.println(number);

        }


        int i = 1, sum = 0;

        for (i = 1; i < 5; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;

        }
// Solution-1
        i = 0;
        while (++i < 5) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;

        }

        // Solution-2
//i = 0 , 1 ,2 ,3 ,4
        while (i < 5) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;

        }
    }
}
