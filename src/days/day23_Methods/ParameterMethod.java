package days.day23_Methods;

public class ParameterMethod {
    public static void main(String[] args) {
        greeting("Ronaldo");
        greeting("Messi");
        String player = "Pele";
        greeting(player);
        sumOfNumbers(10, 60);
    }

    public static void greeting(String name) {
        System.out.println("Hi " + name);
    }

    public static void sumOfNumbers(int min, int max) {
        int sum = 0;
        for (int i = min; i < max; i++) {
            sum += i;
        }
        System.out.println("Sum of the numbers between " + min + " and " + max + " = " + sum);
    }
}
