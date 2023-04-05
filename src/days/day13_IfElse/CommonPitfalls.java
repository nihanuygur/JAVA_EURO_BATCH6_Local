package days.day13_IfElse;

public class CommonPitfalls {
    public static void main(String[] args) {



        int number = 22 ;
        boolean isEven;
        if (number % 2 == 0) { // true

            isEven = true;
        } else  {
            isEven = false;
        }



        isEven = number % 2 == 0;  ///////easy, better and short way !!!




    }
}
