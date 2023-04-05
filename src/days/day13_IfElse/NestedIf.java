package days.day13_IfElse;

public class NestedIf {
    public static void main(String[] args) {
        int number = 12;

        if (number < 20) { //OUTER IF !

            System.out.println( "Number is less than 20");

            if ( number > 15) { // INNER IF !

                System.out.println("Number is bigger than 15");
            }
        }
         /////

        if (number < 20 && number > 15) {
            System.out.println( "Number is less than 20");
            System.out.println("Number is bigger than 15");
        }

        // mike has two key 1 for garden 1 for home.Without entering garden we can not access the home !!
        // if mike can enter garden he can do clean garden !!
        // if mike can enter home as well, he can watch TV !!
        // If mike can not enter Garden and Home , need go to Library

        boolean GardenKeyExist = true;
        boolean HomeKeyExist = false;
        //---> expected result ; clean garden , watch tv

        if (GardenKeyExist) {  // OUTER
            System.out.println( "Clean Garden !!");
            if (HomeKeyExist){  // INNER
                System.out.println("Watch TV !!");
            }
        }
        else { //  ! GARDEN & HOME
            System.out.println("Go to Library !");
        }




    }
}
