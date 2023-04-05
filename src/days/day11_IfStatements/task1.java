package days.day11_IfStatements;

public class task1 {
    public static void main(String[] args) {

        // TASK 1
        //main scenario
        //Extra condition - 2 kid can only take money from 1 person, if father give him money,
        // he can not take money from his uncle. father check has priority, then kid will visit hic uncle !!

//        double balance = 120;
//        int score = 7;
//
//        if (score >= 8) { // ---> FATHER  condition 1
//            balance += 50;
//        }
//        if (8 > score && score > 6) { // ---> UNCLE  condition 1
//            balance += 20;
//        }
//        if (score <= 6) {         // ---> UNCLE  condition 2
//            balance -= 10;
//        }
//        System.out.println("balance = " + balance);

        // TASK 1
        // Second scenario // Extra condition -1 Father if u s<8 u have to pay 20 to me!!

        double balance = 120;
        int score = 5;
        if (score < 8 && score > 6 ) { // ---> FATHER and UNCLE  condition
            balance -= 20;
            balance += 20;
        }
        if (score <= 6) {
            balance -= 10; // --->  FATHER and UNCLE  condition
            balance -= 20;
        }
        if ( score >= 8) {         // ---> FATHER  condition 1
            balance += 50;
        }
        System.out.println("balance = " + balance);
    }
}
