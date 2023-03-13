package accountExercise;

public class BankTest {
    public static void main(String[] args) {
        Bank myOwnBank = new Bank(5);

        myOwnBank.addAccount(new CheckingAccount("EE345687921"));
        myOwnBank.addAccount(new SavingsAccount("FI789456123"));

        myOwnBank.deposit("FI789456123",200);
        myOwnBank.withdraw("FI789456123",100);
        System.out.println("Savings account balance: " + myOwnBank.getBalance("FI789456123"));

        System.out.println("=======");

        myOwnBank.deposit("EE345687921", 500);
        System.out.println("Checking account balance: " + myOwnBank.getBalance("EE345687921"));
    }
}
