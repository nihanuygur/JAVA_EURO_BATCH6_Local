package days.day27_Week4_5Review_Practice;

public class TaskQ1 {
    public static void main(String[] args) {
        printPrimeNumbers(11, 20);
    }
    // Extra q1 : What if I need print only prime numbers after 11
    public static void printPrimeNumbers(int beginning, int limit) {
        int totalPrimeNumber = 0;
        int number = beginning;
        boolean isPrime;

        while (totalPrimeNumber < limit) {
            isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                totalPrimeNumber++;
                System.out.println("Number " + number + " is a prime number!");
            }

            number++;
        }
    }
}
