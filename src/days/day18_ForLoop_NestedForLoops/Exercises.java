package days.day18_ForLoop_NestedForLoops;

public class Exercises {
    public static void main(String[] args) {
        int i = 0;
        for ( i = 1; i < 10 && i >= 1; i++) { //3 5 7 9 11
            System.out.println(i);  //1 3 5 7 9
            i++; //2 4 6 8 10
        }
        System.out.println("out " + i);
        int x = 0;
        for (x=5, i = 0; i < 5 && x < 10; i++, x++) {
            System.out.println("i = " + i);
            System.out.println("x = " + x);

            //print any name of city 5 times
            String city ="Eindhoven";
            for (i=0; i<5; i++){
                System.out.println(city);
            }


        }
    }
}
