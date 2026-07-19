package day11;

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void readData(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        holderName = sc.nextLine();

        do {
            System.out.print("Enter Opening Balance: ");
            balance = sc.nextDouble();
            if (balance < 0)
                System.out.println("Opening balance cannot be negative.");
        } while (balance < 0);
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount.");
    }

    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance.");
        else
            balance -= amount;
    }

    void displayAccount() {
        System.out.println("\nACCOUNT SUMMARY");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.printf("Final Balance: Rs. %.2f\n", balance);
    }
}

public class BankAccountOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        System.out.println("Enter Details of Account 1");
        acc1.readData(sc);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        acc1.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        acc1.withdraw(withdraw);

        acc1.displayAccount();

        System.out.println("\nEnter Details of Account 2");
        acc2.readData(sc);

        System.out.print("Enter Deposit Amount: ");
        deposit = sc.nextDouble();
        acc2.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        withdraw = sc.nextDouble();
        acc2.withdraw(withdraw);

        acc2.displayAccount();

        sc.close();
    }
}
