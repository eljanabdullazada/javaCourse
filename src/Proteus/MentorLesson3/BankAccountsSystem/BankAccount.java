package Proteus.MentorLesson3.BankAccountsSystem;

public class BankAccount {
    private int id;
    private String accountHolder;
    private double balance;

    private int nextId = 0;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
        id = nextId++;
    }

    public void deposit(double depositAmount){
        if(depositAmount < 0) throw new BankException("Deposit amount cannot be negative.");
        balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if(balance < withdrawAmount) throw new BankException("Not enough balance.");
        else if (withdrawAmount < 0) {
            throw new BankException("Withdraw amount cannot be negative.");
        }
        balance = balance - withdrawAmount;
    }

    public int getId() {
        return id;
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

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
