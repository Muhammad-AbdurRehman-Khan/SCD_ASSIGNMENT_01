
public class Main {
    private String accountHolder;
    private double balance;
    private final String pinCode;

    public Main (String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        this.pinCode = pinCode;
        // Enforce non-negative balance upon creation
        this.balance = Math.max(initialBalance, 0.0);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (amount > 0 && this.pinCode.equals(enteredPin) && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}