package days.day14_SwitchCaseStatement;

public class task {
    public static void main(String[] args) {
//
//        Write a program that lets user to enter Mercedes, Volvo, Opel, Sahin Car Models
//        If it is Mercedes display “Good one”
//        If it is Volvo display “Tough one”
//        If it is Opel display “Not bad”
//        If it is Sahin display “Not recommended” Else “Do not buy that one!”

        String model = "Mercedes";
        String message= "";
        switch (model){
            case "Mercedes" :
                message = "Good one";
                break;
            case "Volvo" :
                message = "Tough one";
                break;
            case "Opel" :
                message = "Not bad";
                break;
            case "Sahin" :
                message = "Not recommended";

        }
        System.out.println(message);


//        Write a program that shows students English Level
//        If Beginner display level=1
//        If Elementary display level=2 If Intermediate display level=3 If Advance display level=4
//        If Expert display level=5
        String level = "Beginner";

        switch (level) {
            case "Beginner":
                level = "level=1";
                break;
            case "Elementary":
                level = "level=2 ";
                break;
            case "Intermediate":
                level = "level=3 ";
                break;
            case "Advance":
                level = "level=4 ";
                break;
            case "Expert":
                level = "level=5";
        }
        System.out.println(level);
        //without equality
        int a= 10, b=20, c=30;
        int biggest;
        if (a>=b && a>=c) {
            biggest =a;
        } else if (b>=c && b>=a) {
            biggest =b;

        }else {
            biggest = c;
        }
        System.out.println("The biggest number is " + biggest);
    }
}
