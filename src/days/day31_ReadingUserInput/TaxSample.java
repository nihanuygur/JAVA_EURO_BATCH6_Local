package days.day31_ReadingUserInput;

import java.util.Scanner;

public class TaxSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TOTAL PRICE :" + calculatorTaxPrice(input));
        System.out.println("TOTAL TAX :" + calculatorTotalTax(input));
    }

    public static double calculatorTaxPrice(Scanner input) {
//        Scanner input = new Scanner(System.in); // to not write again and again, we can give parameter

        System.out.println("Please enter Tax Rate; ");
        double TaxRate = input.nextDouble();
        System.out.println("Please enter item price; ");
        double price = input.nextDouble();
        System.out.println("Please enter quantity; ");
        int quantity = input.nextInt();
        return ((TaxRate * price) + price) * quantity;

    }

    public static double calculatorTotalTax(Scanner input) {

//        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Tax Rate; ");
        double TaxRate = input.nextDouble();
        System.out.println("Please enter item price; ");
        double price = input.nextDouble();
        System.out.println("Please enter quantity; ");
        int quantity = input.nextInt();
        return (TaxRate * price) * quantity;

    }
}
