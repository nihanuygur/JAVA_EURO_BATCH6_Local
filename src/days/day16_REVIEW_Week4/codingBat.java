package days.day16_REVIEW_Week4;

public class codingBat {
    public static void main(String[] args) {
//        int a = 4, b = 4;
//
//        int sumDouble = (a == b) ? (a + b) * 2 : (a + b);
//        System.out.println(sumDouble);
//
//        a = 10;
//        b = 6;
//        boolean makes10 = (a==10 || b==10 || a+b ==10) ? true:false;
//        System.out.println(makes10);
    int a= 2;
    int b= 2;
    boolean posNeg=true;
    boolean result ;

    if (a < 0 && b <0 && posNeg) {
        result = true;
    } else if ( (a<0 || b<0 ) && posNeg) {
        if (a<0 && b<0) {
            result = false;
        }else {
            result = true;
        }

    }else {
        result = false;
    }
        System.out.println(result);


    }
}