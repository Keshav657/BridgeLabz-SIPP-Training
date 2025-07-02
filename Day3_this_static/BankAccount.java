package Day3_this_static;

class BankAccount {
    private final int accountNumber;
    private String accountHolderName;
    private static String bankName = "National Bank";
    private static int totalAccounts = 0;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Account Number: " + accountNumber + ", Holder: " + accountHolderName);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice");
        BankAccount acc2 = new BankAccount(1002, "Bob");
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}

