package days.day57_OOPproject;

import java.util.Scanner;

public abstract class Bank {
    Scanner scan = new Scanner(System.in);
    private String bankName;
    private double currentBalance; // to keep current ba;ance for created account
    private double finalBalance; // to keep final balance after account closed -> current balance * (1 + return Rate)
    private String accountType; // GOLD - SAVING - INTEREST

    private double depositBonus;
    private double withDrawExpense;
    private double returnRate;
    private boolean isAccountClosed = true;


    // NEW ADDED
    private double[] bonus = new double[3];
    private double billRate;
    private double withDrawValue;
    private String fullName;
    private static int bankNumber;
    private int accountNumber;


    //////////////////// CONSTRUCTORS ////////////////////

    public Bank(String accountType, double currentBalance, String bankName) {
        this.currentBalance = currentBalance;
        this.accountType = accountType;
        System.out.println("================== Welcome to " + bankName + " !!! ==================");
        System.out.println("Enter Name & Surname : ");
        fullName = scan.nextLine();
        bankNumber++;
        accountNumber = bankNumber;
        isAccountClosed = false;
        this.bankName = bankName;

        depositBonus = bonus[0];
        withDrawExpense = bonus[1];
        returnRate = bonus[2];
    }


    //////////////////// METHODS - Functions ////////////////////


    /**
     * CREATED a method to display account details & Information
     */
    public void showAccount() {
        System.out.println("******** " + bankName + " CUSTOMER ACCOUNT INFORMATION  **********");
        System.out.println("Name of account holder: " + fullName);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + currentBalance);
    }



    /**
     * CREATED a method to pay bills from account and
     * to give some rate according to bill amount
     * @param electricityBill
     */
    public void automaticPayment(double electricityBill) {

        currentBalance = currentBalance - electricityBill;
        System.out.println("getCurrentBalance() = " + getCurrentBalance());

    }


    /**
     * ADDED some conditions to check valid / invalid depositValue, and ask a value again
     * @param depositValue
     */
    public void deposit(double depositValue) {
        while (depositValue <= 0) {
            System.out.println("INVALID AMOUNT, PLEASE RETYPE");
            depositValue = scan.nextDouble()+depositBonus; //*
        }
            currentBalance += depositValue;
            System.out.println("You were deposit " + depositValue + " to your " + getAccountType() + " account !!");
            System.out.println("Your Current Balance is " + getCurrentBalance());

    }

    /**
     * ADDED some conditions to check valid / invalid withDrawValue,
     *                       to put some withdraw limitation and ask a value again
     * @param withDrawValue
     */
    public void withdraw(double withDrawValue) {
        boolean isValid;
            if (withDrawValue > getCurrentBalance()) {
                System.out.println("You tried to withdraw " + withDrawValue + " value, " +
                        "Insufficient fund!!! \n PLEASE RETYPE");
                withDrawValue=scan.nextDouble(); //*
            }
            currentBalance -= withDrawValue;
        System.out.println("You were withdraw " + withDrawValue + " to your " + getAccountType() + " account!!");
        System.out.println("Your Current Balance is : " + getCurrentBalance());
    }

    /**
     * ADDED  some condition for closeAccount
     * @return
     */
    public double closeAccount() {

        if (isAccountClosed()) {
            System.out.println("!!!!!!! Account is already closed !!!!!!!!!");
        } else if (getCurrentBalance() < 0) {
            System.out.println("It is not possible to close your account. You should pay "
                    + getCurrentBalance() * (-1) + "$");
        } else {
            System.out.println(" \t\t******** ACCOUNT CLOSE PROCESS START  **********");
            finalBalance = getCurrentBalance() * getReturnRate();
            currentBalance = 0;
            System.out.println(" !!!!! YOUR FINAL BALANCE : " + getFinalBalance());
            System.out.println("\t\t!!!!!!!!  YOUR ACCOUNT CLOSED    !!!!!!!!");
            isAccountClosed = true;
            accountType = "CLOSED!!!";
        }
        return getFinalBalance();
    }


    //////////////////// GETTER  ////////////////////

    public String getBankName() {
        return bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public String getAccountType() {
        return accountType.toUpperCase();
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithDrawExpense() {
        return withDrawExpense;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public boolean isAccountClosed() {
        return isAccountClosed;
    }

    public double getBillRate() {
        return billRate;
    }


    //////////////////// SETTER ////////////////////

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithDrawExpense(double withDrawExpense) {
        this.withDrawExpense = withDrawExpense;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType.toUpperCase();
    }

    public void setBillRate(double billRate) {
        this.billRate = billRate;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}

