import java.util.Scanner;

class ATMAccount {
    private double balance;
    ATMAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATMAccount acc = new ATMAccount(1000);

        System.out.println("1. Deposit\n2. Withdraw\n3. Show Balance");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount: ");
                double d = sc.nextDouble();
                acc.deposit(d);
                break;

            case 2:
                System.out.print("Enter amount: ");
                double w = sc.nextDouble();
                acc.withdraw(w);
                break;

            case 3:
                acc.showBalance();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}