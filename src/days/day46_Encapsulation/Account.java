package days.day46_Encapsulation;

public class Account {
    // CAPSULATION !! private is capsulation
    private String name;
    private double balance;

    Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public String getName(){
        return name;

    }
    public double getBalance(){
        return balance;
    }
}
