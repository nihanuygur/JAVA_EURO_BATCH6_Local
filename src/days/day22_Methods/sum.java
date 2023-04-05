package days.day22_Methods;

public class sum {
    public static void printNumbers0To10() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int number = 100;
    }

    public static void main(String[] args) {
        printNumbers0To10();
        sumOfTheNumbers0To50();
        int number = 20;

    }

    public static void sumOfTheNumbers0To50() {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int number = 50; //we can create same name again it does not affect.
    }
}
