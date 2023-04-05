package days.day18_ForLoop_NestedForLoops;

public class NestedFor {
    public static void main(String[] args) {

//        int startingPoint = 0;
//        int endPoint = 5;
//        int count =0;
//        for (int i = startingPoint; i < endPoint; i++) { // ascending
//            System.out.println("hello");
//            count++;
//        }
//        System.out.println("count = " + count);
//        for (int i=0; i<4; i++) {
//            if (i%2==0){
//                System.out.println("this number %d is even number");
//            }
//        }
        for(int i=0; i<3;i++) {
            System.out.println(i);
            System.out.println("hello");
            for (int n =0;n<2 ; n++){
                System.out.print(n);
            }
            System.out.println();
            System.out.println("outer");
        }
        // outer loop 1 time,inner loop 2 times city name
        String city="Eindhoven";
        String city1="Milano";
        for (int i =0; i<2;i++){
            for (int x=0;x<2;x++){
                System.out.print("oslo");
            }
            System.out.println();
        }






    }
}
