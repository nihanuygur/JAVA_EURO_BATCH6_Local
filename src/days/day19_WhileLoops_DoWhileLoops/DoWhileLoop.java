package days.day19_WhileLoops_DoWhileLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int c = 0;
        while (c < 100) {
            System.out.println(c);
            c++;
        }
        //
        c=0;
        do {
            System.out.println(c);
            c++;
        }while(c < 100);
        // lets create a code, to print even numbers
        c=11;
        while(c<8){
            System.out.println("c = " + c);
            c+=2;
        }
        c=11;
        do{
            System.out.println("c = " + c);
            c+=2;
        }while (c<8);



    }
}
