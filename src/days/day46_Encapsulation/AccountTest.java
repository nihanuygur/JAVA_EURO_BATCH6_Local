package days.day46_Encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account accountHolder1 = new Account("Mehmet", 200_000);
//        System.out.println("accountHolder1.balance = " + accountHolder1.balance); // attributes are private, so we can't reach them
//        System.out.println("accountHolder1.name = " + accountHolder1.name);
//        accountHolder1.name="Messi";
//        System.out.println("accountHolder1.name = " + accountHolder1.name);

        // ENCAPSULATION !! READ-ONLY METHOD -> just read, can't change

        System.out.println(accountHolder1.getName());
        System.out.println("accountHolder1.getBalance() = " + accountHolder1.getBalance());
        double balance1 = accountHolder1.getBalance();
        System.out.println("balance1 = " + balance1);

        Account accountHolder2 = new Account("Messi", 75.55);
        System.out.println("accountHolder2.getName() = " + accountHolder2.getName());
        System.out.println("accountHolder2.getBalance() = " + accountHolder2.getBalance());

    }
}
