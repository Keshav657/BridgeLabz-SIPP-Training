package Object_Oriented;

import java.util.ArrayList;

// Bank class
class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, customer, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " in " + name);
        return account;
    }

    public String getName() {
        return name;
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() + ", Balance: " + acc.getBalance());
        }
    }
}

// Account class (associated with Bank and Customer)
class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
}

// Demo association
public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");

        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        bank1.openAccount(cust1, 5000);
        bank2.openAccount(cust1, 10000);
        bank1.openAccount(cust2, 7000);

        cust1.viewBalance();
        cust2.viewBalance();
    }
}
