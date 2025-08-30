package Proteus.MentorLesson3.BankAccountsSystem;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(5);  // fixed-size bank with 5 slots
        boolean running = true;

        while (running) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Add a new bank account");
            System.out.println("2. View all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Enter slot index (0-4): ");
                        int index = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter account holder name: ");
                        String holder = scanner.nextLine();

                        System.out.print("Enter initial balance: ");
                        double balance = Double.parseDouble(scanner.nextLine());

                        BankAccount newAccount = new BankAccount(holder, balance);
                        bank.addAccount(index, newAccount);
                        System.out.println("Account added successfully.");

                    } catch (BankException e) {
                        System.out.println("Bank Error: " + e.getMessage());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Invalid index. Please use a valid slot (0-4).");
                    } catch (Exception e) {
                        System.out.println("Unexpected error occurred. Please try again.");
                    }
                    break;

                case "2":
                    try {
                        bank.viewAccounts();
                    } catch (BankException e) {
                        System.out.println("Bank Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Unexpected error occurred while viewing accounts.");
                    }
                    break;

                case "3":
                    try {
                        System.out.print("Enter slot index to update (0-4): ");
                        int index = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter new account holder name: ");
                        String newHolder = scanner.nextLine();

                        System.out.print("Enter new balance: ");
                        double newBalance = Double.parseDouble(scanner.nextLine());

                        bank.updateAccount(index, newHolder, newBalance);
                        System.out.println("Account updated successfully.");

                    } catch (BankException e) {
                        System.out.println("Bank Error: " + e.getMessage());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Invalid index. Please use a valid slot (0-4).");
                    } catch (Exception e) {
                        System.out.println("Unexpected error occurred while updating account.");
                    }
                    break;

                case "4":
                    try {
                        System.out.print("Enter slot index to delete (0-4): ");
                        int index = Integer.parseInt(scanner.nextLine());

                        bank.deleteAccount(index);
                        System.out.println("Account deleted successfully.");

                    } catch (BankException e) {
                        System.out.println("Bank Error: " + e.getMessage());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Invalid index. Please use a valid slot (0-4).");
                    } catch (Exception e) {
                        System.out.println("Unexpected error occurred while deleting account.");
                    }
                    break;

                case "5":
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }
}
