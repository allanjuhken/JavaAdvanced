package accountExercise;

public abstract class Account {
    private double balance;
    private String accountNumber;

    //constructor

    public Account(double balance, String accountNumber) {
        this.balance = balance;
    }
    public Account(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Behaviours
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance - amount < 0){
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
    }

    //getters / setters
    public double getBalance() {return balance;}

    public String getAccountNumber() {return accountNumber;}

}
