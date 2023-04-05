package days.day4_VariablesDataTypes;

public class Variables {

    public static void main(String[] args) {
        // Distance = speed X time
        System.out.println("D = 20 x 1"); // = 20
        System.out.println("D = 40 x 2");
        System.out.println("D = 500 x 10");
        System.out.println("D = 20 x 1");  // Command + d - copy

        /////////////////////

        // BYTE
        // DataType variableName Value

        byte student_1_grade; // -> DECLARATION
        // command + opt + L to align spaces
        byte student_2_grade = 127;
        // System.out.println("Student 2's grade is " + student_2_grade);
        System.out.println(student_2_grade);
        student_2_grade = 100; // you can reassign and update values
        System.out.println(student_2_grade);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(75897790);
        System.out.println(75_897_790); //just for being readable
        System.out.println(75+"."+897+"."+790);
        char turkish = 'ü'; // just one ' and one character
        char turkish2 = 'ö';

        // int intValue = 1.0 ; ---> XXXX It is double number !!!
        // FLOATING
        double doubleValue = 1.0 ;
        System.out.println(doubleValue);
        doubleValue = 1.0;
        System.out.println(doubleValue);
        doubleValue = 1.5;
        System.out.println(doubleValue);
        doubleValue = -2.5;
        System.out.println(doubleValue);
        doubleValue = 1;
        System.out.println(doubleValue);

        // DEFAULT FLOATING NUMBER DATA TYPE IS DOUBLE
        float floatValue = 1.0f;
        float floatValue2 = 1.2F; // key word f or F !!
        System.out.println(1.0); // -->default data type is double
        System.out.println(1); // -->default data type is int

        int weeks = 14;
        long numberOfStudents = 120;
        double averageFinalGrade = 78.6;
        System.out.println(weeks);
        System.out.println(numberOfStudents);
        System.out.println(averageFinalGrade);


        // MULTIDCLARATION

        // double pi;
        // double consionRate ;
        // double temperature ;


        // if all your data type are same, then u can declare them in 1 shot with comma separately

        // double pi, conversionRate, temperature ;
        // pi = 3.14 ;
        // conversionRate = 0.25;
        // temperature = 20.1 ;

        // Declare and assign all of them in 1 line

        double pi = 3.14, conversionRate = 0.25, temperature = 20.1 ;

        //////////////////////

        System.out.println(pi);
        System.out.println(conversionRate);
        System.out.println(temperature);

        System.out.println(pi + conversionRate + temperature); // it will calculate
        System.out.println(pi + "  " + conversionRate + "  " + temperature);


    }


}
