package days.day39_TwoDimensionalArrays_RaggedArrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] n = {{1, 2}, {2, 3}, };
        char key[] = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        char[][] studentsAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        int count = 0;

        for (int i = 0; i < studentsAnswers.length; i++) {
            count = 0;
            for (int x = 0; x < studentsAnswers[i].length; x++) { // to check each student
                if (studentsAnswers[i][x] == (key[x])) { // to check all questions one by one
                    count++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + count);
        }
    }

}
