package accountExercise;

public class Bank {
    private Account[] accounts;
    private int numOfAccounts;

//    public Bank(String[] accounts, int numOfAccounts) {
//        this.accounts = accounts;
//        this.numOfAccounts = numOfAccounts;
//    }

    // behaviours
    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        numOfAccounts = 0;
    }

    // lisab kontonumbri kontorn arraysse
    public void addAccount(Account account) {
        accounts[numOfAccounts] = account;
        numOfAccounts++;
    }

    public Account findAccount(String accountNumber) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public double getBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        }
        return 0;
    }
}
