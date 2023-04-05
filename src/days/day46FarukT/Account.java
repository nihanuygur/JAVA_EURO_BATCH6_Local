package days.day46FarukT;

public class Account {

    private String name;
    private double balance;

    Account(String n, double balance) {
        this.name = n;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    // getBalance
    public double getBalance() {
        return this.balance;
    }

}
