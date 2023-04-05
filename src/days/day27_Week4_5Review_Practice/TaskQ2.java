package days.day27_Week4_5Review_Practice;

public class TaskQ2 {
    public static void main(String[] args) {
        printPrimeNumbers(20);
    }
    // Extra q2 : WHat if I don't want to print and count some specific prime numbers (11 , 23 ,31)
    public static void printPrimeNumbers(int limit) {
        int totalPrimeNumber = 0;
        int number = 1;
        boolean isPrime;

        while (totalPrimeNumber < limit) {
            number++;
            isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (number == 11 || number == 23 || number == 31) {
                continue;
            }
                totalPrimeNumber++;
                System.out.println("Number " + number + " is a prime number!");
            }


        }
    }



}
