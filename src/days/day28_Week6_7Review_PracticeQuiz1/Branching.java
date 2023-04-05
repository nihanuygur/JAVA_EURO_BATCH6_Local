package days.day28_Week6_7Review_PracticeQuiz1;

public class Branching {
    public static void main(String[] args) {
        // break continue return
        for (int i = 0; i<4;i++){//0 1 2 3
            if (i==2){ // 0==2 -> f 1==2 -> f 2==2 -> t
                break;
            }
            System.out.println("i = " + i); // 0 1 2 3 (normally expected without break statement)
            //                 with break      0 1
        }


        for (int i = 0; i<4;i++){//0 1 2 3
            if (i==2){ // 0==2 -> f 1==2 -> f 2==2 -> t 3 == 3 -> f
                continue;
            }
            System.out.println("i = " + i); // 0 1 2 3 (normally expected without continue statement)
            //              with continue      0 1   3
        }
    }
}
