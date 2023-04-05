package days.day19_WhileLoops_DoWhileLoops;

public class Example2 {
    public static void main(String[] args) {
        // for 6 multiplication table
        int number= 6;
        int times =1;
        while (times<=10){
            System.out.println(number +" X " + times + " = "+ (number*times));
            times++;
        }


        while (times<=10){
            System.out.println(number +" X " + times + " = "+ (number*times++));
        }

        int limit=10;
        number=6;
        times=1;
        do{
            System.out.println(number +" X " + times + " = "+ (number*times++));
        }while (times<=limit);
//
        //write send an email then navigate to send folder,verify that email send
        //INBOX, IP (In progress), Sent Folder



    }
}
