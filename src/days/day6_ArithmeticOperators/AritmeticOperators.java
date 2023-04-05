package days.day6_ArithmeticOperators;

public class AritmeticOperators {
    public static void main(String[] args) {
        System.out.println(10 + 50);
        System.out.println(10.50 + 50);
        int a= 20;
        int b = 30;
        int c;
        c = a + b;
        System.out.println(c);
        c = 100;

        System.out.println("c = " + c);
        System.out.println(10 * 20);
        System.out.println(50.50 * 10);
        double d = 10.80 * 14;
        System.out.println("d = " + d);
        double d2 = 151.1234567890123456789;
        float f = 151.1234567890123456789f;
        System.out.println("d2 = " + d2);
        System.out.println("f = " + f);
        System.out.println(10 / 3);
        double resultDivision = 10.0 / 3;
        System.out.println("resultDivision = " + resultDivision);
        System.out.println(10 % 3); // % to find remainder (kalan) MODULUS
        System.out.println(10 + 21 / 3 * 7 % 2 - 3);

        System.out.println("Hello" + 100 * 2 + 5);
        //System.out.println("Hello" + 100 * 2 - 5); we can't use subtraction (-)
                                         // -------> string - int ----> it will give an error
        System.out.println('a' + 'b');
        System.out.println('a' + 'b' + "" +'a' + 'b') ;
        System.out.println('a' + 'b' + "" +('a' + 'b')) ;
        System.out.println("100" + 'a'+ 200 + 300);

        ///SWAP VALUES
        int x = 20;
         int y = 30;
        // x= 30 y=20 with operators operation
         int z = x + y;
         x = z - x;
         y = z-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // swap the values without creating another variable
        int g = 20;
        int e = 30;
        g= g + e;
        e= g -e;
        g= g-e;
        System.out.println("e = " + e);
        System.out.println("g = " + g);

        System.out.println("2+2" +3 + 4);
        System.out.println("(2+2) " + (3+4));


    }
}
