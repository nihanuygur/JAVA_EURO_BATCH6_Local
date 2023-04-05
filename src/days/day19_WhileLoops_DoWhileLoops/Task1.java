package days.day19_WhileLoops_DoWhileLoops;

public class Task1 {
    public static void main(String[] args) {
        //Convert following do-while loop into for loop.
        int l = 0;
        int m = 6;
        do {
            m = m * 2;
            System.out.println(m);
            l++;
        } while (l <= 5);

        m = 6;
        for(l=0;l<=5;l++){
            m*=2;
            System.out.println(m);
        }



    }
}
