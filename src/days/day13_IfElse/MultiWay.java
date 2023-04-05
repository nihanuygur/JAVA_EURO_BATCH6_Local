package days.day13_IfElse;

public class MultiWay {
    public static void main(String[] args) {
        // grade
        // 100 - 90 = A
        // 89 - 80 = B
        // 79 - 70 = C
        // 69 - 60 = D
        // 59 - 00 = F

//        int grade =80;
//        if (grade <= 100 && grade>=90){
//            System.out.println("Grade = A");
//        }
//        if (grade <= 89 && grade>=80){                 // just check for down value
//            System.out.println("Grade = B");
//        }
//        if (grade <= 79 && grade>=70){
//            System.out.println("Grade = C");
//        }
//        if (grade <= 69 && grade>=60){
//            System.out.println("Grade = D");
//        }
//        if (grade <= 59) {
//            System.out.println("Grade = F");
//        }
/////////////////////////////////////////////////
//        int grade =80;
//        if (grade <= 100 && grade>=90){
//            System.out.println("Grade = A");
//        } else
//            if (grade>=80){                 // just check for down value
//            System.out.println("Grade = B");
//        } else
//            if (grade>=70){
//            System.out.println("Grade = C");
//        } else
//            if (grade>=60){
//            System.out.println("Grade = D");
//        } else {
//            System.out.println("Grade = F");
//        }
/////////////////////////////////////////////////
//        int grade =80;
//        if (grade <= 100 && grade >=0) {
//            if (grade <= 100 && grade >= 90) {
//                System.out.println("Grade = A");
//            } else if (grade >= 80) {                 // just check for down value
//                System.out.println("Grade = B");
//            } else if (grade >= 70) {
//                System.out.println("Grade = C");
//            } else if (grade >= 60) {
//                System.out.println("Grade = D");
//            } else {
//                System.out.println("Grade = F");
//            }
//        } else {
//            System.out.println("Grade is invalid !! ");
//        }

        /////////////////////////////////////////////////

        int grade =80;
        String result;

        if (grade > 100 && grade <0) {
            result = "Grade is invalid !! ";
        } else if (grade <= 100 && grade >= 90) {
            result = "Grade = A";
        } else if (grade >= 80) {                 // just check for down value
            result = "Grade = B";
        } else if (grade >= 70) {
            result = "Grade = C";
        } else if (grade >= 60) {
            result = "Grade = D";
        } else {
            result = "Grade = F";
        }

        System.out.println("result = " + result);


        // try to use multi-way with if - elseif - else


        if (false); // DON'T USE !!!! ;
        {
            System.out.println("FALSEEE!!");
        }




        
        








    }
}
