package days.day21_BranchingStatements_LabeledStatement;

public class ContinueStatement {
    public static void main(String[] args) {
        //Branching Statement

        int number = 1;
        for (number = 1; number < 50; number++) {
            if (number != 13) {
                System.out.println(number);
            }
        }

        for (number = 1; number < 15; number++) {
            if (number == 13) {
                continue;
            }
            System.out.println(number);
        }

        int start = 1;
        int sum = 0;
        do {
            if (start % 2 == 0) {
                continue;
            }
            sum += start;
        } while (++start <= 10);
        System.out.println(sum);
        sum = 0;
        int i = 0;
        for (i = 0; i < 4; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;

        }
        System.out.println("sum = " + sum);
        System.out.println(i);

        i = 0;
        sum = 0;
        while (++i < 4) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("i = " + i);

        //print all timetable
        // 1X1=1      2X1=2
        // 1X2=2      2X2=4
        // 1X3=3      2X3=6
        //
        // 1X5=5      2X5=10

        for (int j = 0; j < 5; j++) { // outer loop; represent of each timetable 1s 2s 3s ...

            for (int k = 1; k <= 5; k++) {
                System.out.println(j + " X " + k + " = " + (j * k));
            }
            System.out.println("|||||||||||||||||||||");
        }

        for (int j = 0; j < 5; j++) { // outer loop; represent of each timetable 1s 2s 3s ...
                for (int k = 1; k <= 5; k++) {
                    if ((j*k==10)){
                        continue; // this statement will affect only INNER LOOP !!
                    }
                    System.out.println(j + " X " + k + " = " + (j * k));
                }
            System.out.println("|||||||||||||||||||||");
        }

    }
}
