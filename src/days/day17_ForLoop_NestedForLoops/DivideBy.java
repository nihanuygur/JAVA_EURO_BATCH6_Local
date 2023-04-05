package days.day17_ForLoop_NestedForLoops;

public class DivideBy {
    public static void main(String[] args) {
        //10-30 %2 %3 %5
        for (int i=10;i<=30;i++) {
            System.out.println("i = " + i);
            if (i%2==0) {
                System.out.println(i + " is dividable by " + 2);
            }
            if(i%3==0){
                System.out.println(i + " is dividable by " +3);
            }
            if(i%5==0){
                System.out.println(i + " is dividable by " +5);
            }
        }

        //how many numbers can be  dividable by 2
        int number2 =0;
        int number3 =0;
        int number5 =0;
        int number235 =0;
        int sum2 = 0;
        int sum3 = 0;
        int sum5 = 0;
        int sum235 = 0;
        for (int i =10;i<=50;i++){
            if (i%2==0 ) {
                ++ number2 ;
                sum2 +=i;
            }
            if(i%3==0){
                ++ number3 ;
                sum3 +=i;
            }
            if(i%5==0){
                ++ number5 ;
                sum5 +=i;
            }
            if(i%2==0&&i%3==0&&i%5==0){
                ++ number235 ;
                sum235 +=i;
            }
        }
        int average2=sum2/number2;
        int average3=sum3/number3;
        int average5=sum5/number5;
        int average235=sum2/number235;
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number5);
        System.out.println(number235);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum5);
        System.out.println(sum235);
        System.out.println(average2);
        System.out.println(average3);
        System.out.println(average5);
        System.out.println(average235);







    }
}
