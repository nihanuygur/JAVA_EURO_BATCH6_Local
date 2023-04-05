package days.day15TalhaT;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println("\n//////////////// TASK-1 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        int num =11;

        String number = (num %2 == 0) ? " is even number" : " is odd number" ;

        System.out.println(num  + number);


        ////////////////////////////////

        int n1 = 331341;
        System.out.println((n1 % 2 == 1) ? n1 + " is an odd number" : n1 + " is an even number");
        //////////////////////////////////

        String result;


        result = (num %2 ==0) ? ("Even") : ("Odd");

        System.out.println(result);





        System.out.println("\n//////////////// TASK-2 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");


//        Write a program that checks if a student operator:
//        Pass limit is 50. Please inform the student how much he/she need to pass the exam
//        Do not trust the INPUT mark.. try to cover borders!!
//        Sample1: Your mark is 80 and you passed
//        Sample2: Your mark is 45 and you failed. You needed 5 more points to pass the exam

// Solution with multi-way if-else
        int mark = 80;
        final int LIMIT= 50;
        String resultMark= "Your mark is "+mark+" and you ";

        if(mark>100 || mark<0){
            resultMark= "NEGATIVE INPUT!!";
        }else if(mark>=LIMIT){
            resultMark+= "passed";
        }else{
            resultMark+= "failed. You needed "+(LIMIT-mark)+" more points to pass the exam";
        }

        System.out.println(resultMark);

        //////////////////////////

// Solution with Ternary Opr

        resultMark = (mark>100 || mark<0) ? ("NEGATIVE INPUT!!"): ( (mark>=LIMIT) ? resultMark+"passed" : resultMark+"failed. You needed "+(LIMIT-mark)+" more points to pass the exam");

    }
}
