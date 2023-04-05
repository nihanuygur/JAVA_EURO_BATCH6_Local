package days.day11_IfStatements;

public class task1TalhaT {
    public static void main(String[] args) {
        // TASK 1
        //main scenario
        //Extra condition - 2 kid can only take money from 1 person, if father give him money,
        // he can not take money from his uncle. father check has priority, then kid will visit hic uncle !!

        double balance = 120;
        int score = 7;
        boolean flag =  false; // Did you take any money?!

        if (score >= 8) { // ---> FATHER  condition 1
            balance += 50;
            flag = true;
        }
        if (!flag && score > 6) { // ---> UNCLE  condition 1
            balance += 20;
        }
        if (score <= 6) {         // ---> UNCLE  condition 2
            balance -= 10;
        }
        System.out.println("balance = " + balance);

        int number = 30;
        if (number % 2 ==0) {
            System.out.println(number + " is even");


        }
        System.out.println("a ' and a \"? Or between a ,\" and a ,\\\"?");
        System.out.println(number + " is odd");
        //+----+
        //\\    /
        ///    \\
        System.out.println("+----+");
        for ( int i = 1 ; i <=3; i++){
            System.out.println("\\    /");
            System.out.println("/    \\");

        }
        System.out.println("+----+");

        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("_\"_'_\"_'_\"_");
        System.out.println("\\         /");
        System.out.println(" \\_______/");












    }
}
