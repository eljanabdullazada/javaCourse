package Proteus.MentorLesson3.BankAccountsSystem;

public class Bank {
    private BankAccount[] bankAccounts;
    private int capacity;

    public Bank(int capacity) {
        bankAccounts = new BankAccount[capacity];
        this.capacity = capacity;
    }

    public void addAccount(int index, BankAccount accountToAdd) {

        if (index < 0 || index >= capacity) throw new BankException("Invalid index.");
        if (bankAccounts[index] != null) throw new BankException("There is already an account in this position.");
        bankAccounts[index] = accountToAdd;

    }

    public void viewAccounts() {
        boolean hasAccounts = false;
        for (int i = 0; i < capacity; i++) {
            if (bankAccounts[i] != null) {
                System.out.println("In slot " + i + " " + bankAccounts[i] + " located");
                hasAccounts = true;
            }
        }
        if(!hasAccounts){
            throw new BankException("No accounts exist.");
        }
    }

    public void updateAccount(int index, String newAccountHolder, double newBalance) {

        if (index < 0 || index >= capacity) throw new BankException("Invalid index.");
        if (bankAccounts[index] == null) throw new BankException("There is no account to update.");

        bankAccounts[index].setAccountHolder(newAccountHolder);
        bankAccounts[index].setBalance(newBalance);

    }

    public void deleteAccount(int index){
        if (index < 0 || index >= capacity) throw new BankException("Invalid index.");
        if (bankAccounts[index] == null) throw new BankException("There is no account to delete.");
        bankAccounts[index] = null;
    }

}

