package days.day57_OOPproject;
import java.util.Scanner;
public class Akbank extends Bank {
    Scanner scan = new Scanner(System.in);


    ////////////// CONSTRUCTOR 1


//    public Akbank(String accountType, double currentBalance) {
//        super(accountType, currentBalance + 120, "Akbank");
//        double[][] akBonus = {{80, 70, 1.3}, {90, 60, 1.2}, {100, 50, 1.1}};
//        //                    gold         saving     interest
//        boolean isValid = true;
//        do {
//            isValid = true;
//            if (getAccountType().equals("GOLD")) {
//                setBonus(akBonus[0]);
//            } else if (getAccountType().equals("SAVING")) {
//                setBonus(akBonus[1]);
//            } else if (getAccountType().equals("INTEREST")) {
//                setBonus(akBonus[2]);
//            } else {
//                System.out.println("INVALID ACCOUNT TYPE, PLEASE RETYPE");
//                super.setAccountType(scan.nextLine());
//                isValid = false;
//            }
//        } while (!isValid);
//        System.out.println("YOUR " + getAccountType() + " ACCOUNT IS CREATED, \nCURRENT BALANCE: " + getCurrentBalance());
//    }

    ////////////// CONSTRUCTOR 2
    public Akbank(String accountType, double currentBalance) { // CHECKING BALANCE // CHECKING VALID ACCOUNT TYPE // ASSIGNING BONUSES
        super(accountType, currentBalance + 120, "Akbank");
        while (getCurrentBalance() < 0) {
            System.out.println("INVALID BALANCE, PLEASE RETYPE");
            super.setCurrentBalance(scan.nextDouble()+120);
        }
        String[] akbankType = {"GOLD", "SAVING", "INTEREST"};
        double[][] akbankValue = {{80, 70, 1.3}, {90, 60, 1.2}, {100, 50, 1.1}};
        boolean isValid = false;

        for (int i = 0; i < akbankValue.length; i++) {
            while (!isValid) {
                if (super.getAccountType().equals(akbankType[i])) {
                    setDepositBonus(akbankValue[i][0]);
                    setWithDrawExpense(akbankValue[i][1]);
                    setReturnRate(akbankValue[i][2]);
                    isValid = true;
                    System.out.println("YOUR " + getAccountType() + " ACCOUNT IS CREATED, " +
                            "\nCURRENT BALANCE: " + getCurrentBalance() + " (120 $ WELCOME MONEY INCLUDED)");
                } else {
                    System.out.println("INVALID ACCOUNT TYPE, PLEASE RETYPE");
                    super.setAccountType(scan.nextLine());
                }
            }
        }
    }

    /**
     * CREATED a method to pay bills from account and
     * to give some rate according to bill amount
     * @param electricityBill
     */
    public void automaticPayment(double electricityBill) {
        while (electricityBill <= 0) {
            System.out.println("INVALID AMOUNT, PLEASE RETYPE");
            electricityBill = scan.nextDouble();
        }
        setBillRate(0.05);
        if (electricityBill > 100) {
            super.automaticPayment(electricityBill - electricityBill * getBillRate());
            System.out.println("Your current balance is  " + getCurrentBalance());
        } else {
            super.automaticPayment(electricityBill);
        }
    }
    /**
     * ADDED some conditions to check valid / invalid depositValue, and ask a value again
     * @param depositValue
     */
    @Override
    public void deposit(double depositValue) {

        if (depositValue < 2000) {
            super.deposit(depositValue);
        } else {
            super.deposit(depositValue + getDepositBonus());
        }
    }


    /**
     * ADDED some conditions to check valid / invalid withDrawValue,
     *                       to put some withdraw limitation and ask a value again
     * @param withDrawValue
     */
    @Override
    public void withdraw(double withDrawValue) {
        while (withDrawValue > 10000 || withDrawValue <= 0) {
            if (withDrawValue <= 0) {
                System.out.println("INVALID AMOUNT PLEASE RETYPE");
            } else {
                System.out.println("NOT ALLOWED UPPER THAN 10_000 $ AMOUNT \n PLEASE TRY AGAIN");
            }
            withDrawValue = scan.nextDouble(); //*
        }
        if (withDrawValue < 1000) {
            super.withdraw(withDrawValue);
        } else {
            super.withdraw(withDrawValue + getWithDrawExpense());
        }
    }
}