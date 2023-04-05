package days.day15_TernaryOperator;

public class task {
    public static void main(String[] args) {
        // Math.abs(6)//a < 0 ? -a : a
//        String triangle = " a valid triangle.";
//        int a = 10 , b = 8 , c = 6;
//        int for_a_abs, for_b_abs, for_c_abs;
//        for_a_abs = ((b-c)<0) ? (c-b) : (b-c);
//        for_b_abs = ((a-c)<0) ? (c-a) : (a-c);
//        for_c_abs = ((a-b)<0) ? (b-a) : (a-b);
//        boolean isOk_a, isOk_b, isOk_c ;
//        isOk_a = ((for_a_abs < a) && (a < (c+b)));
//        isOk_b = ((for_b_abs < b) && (b < (a+c)));
//        isOk_c = ((for_c_abs < c) && (c < (a+b)));
//
//        // with TernaryOperator
//        triangle = (isOk_a && isOk_b && isOk_c) ? triangle : " not " + triangle;
//        System.out.println(triangle);
//
//        // with If Else
//        if (isOk_a && isOk_b && isOk_c) {
//            System.out.println(triangle);
//        }else {
//            System.out.println( " not " + triangle);
//        }


        String triangle = " a valid triangle.";
        int a = 10 , b = 8 , c = 6;
        triangle = (Math.abs(c-b)<a && a<c+b ) && (Math.abs(a-c)<b && b<a+c ) && (Math.abs(a-b)<c && c<a+b )
                ?"This is "+triangle :"This is not" + triangle;
        System.out.println(triangle);
















    }

}
