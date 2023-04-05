package days.day24_REVIEW_Week6;

public class Quiz {
    public static void main(String[] args) {
        int k=0;
        int m=0;
        for(int i=0;i<=3;i++) {
            k++;
            if (i==2) {
                i=4; }
            m++;
        }
        System.out.println(k + " ." + m);
    }
}
