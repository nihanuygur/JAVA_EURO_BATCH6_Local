package days.day12_REVIEW_Week_3;

public class Review {
    public static void main(String[] args) {
        int number = 10 +1; // 11 --> 12 --> 13
        
//        number++ ---> get number then inc value !!
//        ++number ---> inc value first then get the updated number !!
        System.out.println("number = " + number);  // 11
        System.out.println("number++ = " + number++);  // 11
        System.out.println("number = " + number);  // 12
        System.out.println("++number = " + ++number);  // 13
        
        
        number = 1; //
        
        int num2 = number + number++ * --number / number;
               //=             1     *     1        
               //=    1   +    1     *     1    /   1
               //=    1   +          1          /   1
               //=    1   +          1 
               //=    2
        
        
        number = 11;  // -->12  -->11   -->12 -->13
        
        num2 = number / (number++ + --number) - (number - number++) * ++number;
 //              11   / ( 11      +     11  ) - ( 11    - 11      ) *   13
        //   =   11   / (22)                  -           (   0   ) *   13
        //   =          0                     -                0
        //   =          0

        System.out.println("num2 = " + num2);



        
    }
}

