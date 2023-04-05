package days.day5_VariablesDataTypesStrings;

public class Variable2 {
    public static void main(String[] args) {

        System.out.println(.1);
        System.out.println(.5);
        char number7 = '7' ;
        int num7 = '7' ; // ?
        double valueDouble = 12.4;  // option + enter to create variable shortly
        System.out.println(3>2);

        ///////////////////////////
        char letterA = 'A';
        System.out.println(letterA);

        int letterAdec = 'A'; // A's decimal number
        System.out.println(letterAdec);

        char letterB = 66;  // C from unicode table
        System.out.println(letterB);

        String strValue = "12232^^^&üüğ42o8rywıdkhjTEST";

        System.out.println(strValue);

        String number1str = "1";
        System.out.println(number1str);
        int num1 = 1;
        System.out.println(num1);
        char num1char = 1 ;
        System.out.println((num1char));

        byte num1byte = 1 ;
        System.out.println(num1byte);

        System.out.println(num1 + num1);  // numeric + numeric = numeric !!!!
        System.out.println(num1 + number1str); // num + str = str (CONCATENATION)

        int value1 = 10;
        int value2 = 20;

        //Result of sum = 30
        
        System.out.println("Result of sum = " + value1 + value2); // it sees them as a string, so it is writing 1030
                                                                    // String Concatenation
        System.out.println("Result of sum = " + (value1 + value2));

        boolean bValue = true;
        System.out.println("TEST" + bValue);
        System.out.println("TEST" + " VALUE");

        System.out.println((value1 + value2));

        String test;
       // test = 1 ; // ERROR

        test = "1" + 1 ; // concatenation to string
        System.out.println(test);
        System.out.println("test = " + test); //soutv is the easy way !!
        
        int nn = 1 + 1 + 2;
        System.out.println("nn = " + nn);
        
        String aaa= "asdf" + "aasadhj";
        System.out.println("aaa = " + aaa +aaa);







    }
}
