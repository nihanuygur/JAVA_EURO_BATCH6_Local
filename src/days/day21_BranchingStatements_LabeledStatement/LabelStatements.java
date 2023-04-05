package days.day21_BranchingStatements_LabeledStatement;

public class LabelStatements {
    public static void main(String[] args) {


        outer:
        for (int j = 0; j < 5; j++) { // outer loop; represent of each timetable 1s 2s 3s ...
            for (int k = 1; k <= 5; k++) { //inner loop ;represent of each calculation
                if ((j * k == 10)) {
                    break outer;
                }
                System.out.println(j + " X " + k + " = " + (j * k));
            }
            System.out.println("|||||||||||||||||||||");
        }

    }
}
