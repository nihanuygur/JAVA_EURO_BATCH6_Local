package days.day11_IfStatements;

public class task4 {
    public static void main(String[] args) {
        // TASK 4
// Write an if statement that increases pay by 3% if score is greater than 90,
// otherwise increases pay by 1%.

        //One way if statement;
        int score = 95;
        double pay = 6000;

        if (score > 90) {
            pay *=1.03;
        }
        if (score <= 90) {
            pay *=1.01;
        }

        System.out.println("pay = " + pay);

        //Two way if-else statement
        if (score > 90) {
            pay *=1.03;
        } else {
            pay *=1.01;
        }

        System.out.println("pay = " + pay);

    }
}
