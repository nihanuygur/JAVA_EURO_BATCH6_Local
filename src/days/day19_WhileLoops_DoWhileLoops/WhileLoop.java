package days.day19_WhileLoops_DoWhileLoops;

public class WhileLoop {
    public static void main(String[] args) {
//        int number =100;
//        for (int count = 0; count<100;count++){
//            System.out.println("Welcome to the Java Paradise");
//        }

        int count = 0;
        while (count < 100) { //just condition, not any declaring
            System.out.println("Welcome to the Java Paradise");
            count++;
        }

        while (count < 100) { //just condition, not any declaring
            count++; // if you first inc/dec then be careful to use variable!!
            System.out.println("Welcome to the Java Paradise");
        }

        int x=1000; // this sample not a infinitive loop, because int has limitation
        while (x>0){
            x++;
        }
        System.out.println("x = " + x);
//



    }
}
