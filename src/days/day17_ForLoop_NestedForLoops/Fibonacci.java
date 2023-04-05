package days.day17_ForLoop_NestedForLoops;

public class Fibonacci {
    public static void main(String[] args) {
        //fibonacci
        int n=100;
        int t1=0;
        int t2=1;
        for (int i=1;i<n;i++){
            System.out.print( t1 + " ");
            if(t2<n && t1 <n) {
                int t3 = t1 + t2;
                t1 = t2;
                t2 = t3;
                switch (t3){
                    case 100:
                        break;

                }
            }
        }








    }
}
