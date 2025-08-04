// File: BankCustomer.java
class BankCustomer {

    String customerName;
    double balance;

    // Constructor
    BankCustomer(String name, double initialBalance) {
        customerName = name;
        balance = initialBalance;
    }

    // Method to display details
    void showDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: ₹" + balance);
    }

    // Main Method
    public static void main(String[] args) {
        BankCustomer c1 = new BankCustomer("Rutvi", 15000);
        c1.showDetails();
    }
}