package days.day17_ForLoop_NestedForLoops;

public class for4 {
    public static void main(String[] args) {
        for (int i=5; i>0; i--){
            System.out.print(i);
            System.out.println("hello");
        }

        for (int i=0; i<30 ; i +=5) {
            System.out.println("i = " + i);
        }

        for (int i=0; i <=6;i++){
            for (int x = 0; x<11; x++){
                System.out.println(i + " X " + x + " = " + x*i);
            }
            System.out.print(" ");
        }





    }
}
