package accountExercise;

public class SavingsAccount extends Account{
    private double interestRate;

    //constructor
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        interestRate = 0.0;
    }

    //setters / getters
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
}
