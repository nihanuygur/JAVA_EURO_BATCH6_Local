package days.day33_RandomClassMathClassDateClass;

import java.util.Random;

public class RandomSample {
    static         Random random = new Random();

    public static void main(String[] args) {

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        ////////

        int randomWithRange = random.nextInt(101); // 0 -100 (inclusive) -- random.nextInt(); looks like similar 
        // but the parameters are different, different methods
        System.out.println("randomWithRange = " + randomWithRange);

        // between n to 100
        int begin =5;
         int randomWithRange2 = random.nextInt(10-begin);
        System.out.println("randomWithRange2 = " + (randomWithRange2+begin));

        ////////
        double randomDouble = random.nextDouble(); // 0 <= x && x < 1.0
        System.out.println("randomDouble = " + randomDouble);

        double gradesD= random.nextInt(100) + random.nextDouble();
        System.out.println("gradesD = " + gradesD);

        // generate random number between min and max value

        int min =1;
        int max=5;
        int result = random.nextInt(max-min)+min;
        // ID number for student and it should be 4 digits !!!!
        System.out.println("ID = " + ID());

        Odd();






    }

    public static int ID(){

        int min =1000;
        int max =10000;
        return random.nextInt(max-min)+min;

    }
    public  static  int Odd(){
        int min =50;
        int max =100;
        int number = random.nextInt(max-min)+min;
        while (true){
            if (number%2!=0){
                break;
            }
        }
        return number;
    }
//    public  static  int Odd2(){
//        int min =50;
//        int max =100;
//        int number;
////        do ( ){
////            number = random.nextInt(max-min)+min;
////        }while (number%2==0);
////        return number;
//    }
}
