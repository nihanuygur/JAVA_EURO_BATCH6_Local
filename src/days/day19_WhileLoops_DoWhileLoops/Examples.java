package days.day19_WhileLoops_DoWhileLoops;

public class Examples {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        while (i < 100) { // we are starting from 0, so we can increase 2 by 2
            sum += i;
            i += 2;
        }
        System.out.println(sum);

        int number=30;
        while (number>20){
            System.out.println("in the loop");
            number--;
        }
        i = 1;
        while (i < 10) {
            if ((i++) % 2 == 0) {
                System.out.println(i);
            }
        }


    }
}
