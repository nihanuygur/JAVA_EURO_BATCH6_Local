package days.day26TalhaT;

public class GeneralReview1 {

// ALGORITHM SAMPLE!!!
//   Print prime numbers till given quantity...
//   I would like to print first "50" prime number
//   hint min prime number is 2

    // ONLY ALGORITHM !!


    /*
   - WE need a method to check number is prime or not!!!

   - I need to find prime 2 ---> end of my limit  --> totalPrime number!! --> OUTER LOOP
   --> in each iteration I need only check my limit!!  --> because of indefinite loop structure
   may be "do/while" or "while" will be better

   - for each iteration I need check number is prime or not !!
     --> I need divide numbers one by one      11 (11%2==0  , 11%3 ,4 ,5,6... number-1)
        --> if we have at least 1 result ==0 is true, we need to BREAK inner loop  ...
     */


    // VARIABLES

    static int test;
    static String str;
    static boolean flag;

    public static void main(String[] args) {
// if u type any integer --> default int
        //  long test= 1234567823213L;
//--> floating numbers -> default double
        float test2= 3.1F;


        str= "asdasd  sadasda s 1321^&^^$Â£%  adasdasd";
        char character= '1';
        int decSpace= character;

        if('A'<=character && 'Z'>= character ){
            System.out.println("char is capital letter");
        }


//        System.out.println("decSpace = " + decSpace);
//
//        System.out.println("test = " + test);
//        System.out.println("flag = " + flag);

//        castingTest();
//        unaryOpr();

        relationalOpt();
    }

    public void testMethod(){
        System.out.println("test = " + test);

        int test=0;
        System.out.println("test = " + test);

        if(true){
            int test2=1;
            System.out.println("test2 = " + test2);
        }
    }



    ////////   CASTING


    // IMP --> WIDENING VALUE!!! --> AUTOMATICALLY!!
    public static void castingTest(){
        double dBalue= 5;  // 5 (32 bit) -> 5.0  (64bit)


        // EXP --> NARROWING --> MANUALLY

        int intValue = (int) 5.0;  //  5.0 (64bit) --> 5 (32 bit)

        intValue =  (int) 5.99;

        System.out.println("intValue = " + intValue);


        ///////////////

        byte bValue= (byte) 128;

        System.out.println("bValue = " + bValue);

    }


    public static void unaryOpr(){

        int number = 1; // 2 --> 1

        int num2 = number++;
        System.out.println("num2 = " + num2); // 1

        int num3 = --number;
        System.out.println("num3 = " + num3); // 1

        number=1;
        int num4 = number + ++number * number-- - number;

        //       = 1 + 2 * 2 - 1
        //       = 1 + 4 - 1
        //       = 5 - 1 = 4
        System.out.println("num4 = " + num4);

        boolean isBlaBlaExist= true;

        if(isBlaBlaExist){
            // blalba for true cond
        }
        // ....
        if(!isBlaBlaExist){
            //blabla will run if cond false!!!
        }

        int test3= -(num3*num2);  // Unary minus operator

    }

    public static void relationalOpt() {
        int number =15;
        if (number<=10 && number>=5 && number!= 0  ){
            System.out.println("Number is between 5 to 10");
        }

        number = 1;
        int number2 =1;

        if (number<0 && ++number==2){
            System.out.println("HIYAA");
        }

        if (++number2 ==2 && number2<0){
            System.out.println("HOYAA");
        }

        System.out.println("number = " + number); // --> 1
        System.out.println("number2 = " + number2); // --> 2 ?


//        number2 = number2 +1 ;
//        number2++;
//        number2+=1;

        number2 *= 5;  // same with -> number2 = number2 * 5;

        System.out.println("/////////////////////////////////////////// \n");
        number=1;


        if (number<0 || ++number == 2){
            System.out.println("HIYAA");
        }

        System.out.println("number || = " + number);  //--> 2

        number=1;
        if (++number == 2 | --number < 0){
            System.out.println("HOYAA");
        }
        System.out.println("number || = " + number);  //--> 1


        number=1;
        if (++number == 2 || number-- < 0){
            System.out.println("HOYAA");
        }
        System.out.println("number || = " + number);  //--> 2
    }
    public static int ageIdentifier(int month, int year){
        // dd/mm/YY
//            30/03/19  ->   19
//            30/11/19  ->   19+50 = 69
//            30/02/20  ->   20+50-1 = 69
//            30/03/2020  ->   20

        // 1 ---- 12  NORMAL CALENDER YEAR ..
        // 3 ---- 2  PLATE YEAR ..


        //Age identifiers are the last two digits of the year between March and August, or the last two digits plus
//    50 if between September and February (registration years can be thought of starting in March). So,
//    for  March 2018, it is “18” and for the 27th of February 2019, it is “68” (not “69”).

//     opt-1    3-8  ->   19
//     opt-2    9-12 ->  19+50 =69
//     opt-3    1-2  ->  20+50 -1 =69

        int ageIdent ;

        if (month < 3) {  // opt 3 (1.-2.)
            ageIdent = year + 49;
        } else if (month < 9 ) {  // opt 1 (3. - 8.)
            ageIdent = year;
        } else {  // opt 2 (9.- 12.)
            ageIdent = year + 50;
        }

        return ageIdent;
    }


}
