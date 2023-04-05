package days.day7_CastOperatorsTypeCasting;

public class CastingExamples {
    public static void main(String[] args) {
        long numLong = 4111311121111111L;
        // int numInt = numLong
        int numInt = (int) numLong; // exp casting
        System.out.println("numInt = " + numInt); // -337331193


        short num1 = 10;
        short num2 = 10;

       // short num3 = num1 + num2; will return ERROR !!!!!!
        // why? short data type turn to int during arithmetic explanation
        short num3 = (short) (num1 + num2);

        long numLong2 = 20; //implicitly casting
        float numF = 10f;

        int pies = 10, people = 4;
        double piesPerson;
        piesPerson = (double) pies / people;
        piesPerson =  pies / (double) people;

        System.out.println(piesPerson);


    }
}
