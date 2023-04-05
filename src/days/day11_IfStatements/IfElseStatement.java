package days.day11_IfStatements;

public class IfElseStatement {
    public static void main(String[] args) {
// TWO WAY - IF ELSE CONDITION
//      if (boolean - expression ) {
//        statement(s);
//    }
//      if else {
//        statement(s);
//    }
         int score = 70 ;
         // if score is equl or greater than 80 -> 80 u will pass the exam, if less than 80, u fail !!

       // WAY ONE
        if (score >= 80) {

            System.out.println(" PASS");
        }
        if (score < 80){
            System.out.println("FAIL !");
        }

      // WAY TWO - faster and easier one
        if (score >= 80) {

            System.out.println(" PASS");
        } else  {
            System.out.println("FAIL !");
        }
// number can be zero - negative - positive

        int number = 20;
        if (number > 0) {
            System.out.println("POSITIVE");
        }
        else if (number < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("ZERO");
        }

        int age = 20;

        if (age >= 18){
            System.out.println("Eligible to vote");
        }

        else {
            System.out.println("Sorry");
        }



    }
}
