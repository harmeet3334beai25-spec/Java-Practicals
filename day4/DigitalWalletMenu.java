package day4;

import java.util.Scanner;

public class DigitalWalletMenu {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
        double balance = 1000.0;
        int choice;
        double amount;

        do {
            System.out.println("1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to add: Rs. ");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Money added successfully.");
                        System.out.println("Current Balance: Rs. " + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter payment amount: Rs. ");
                    amount = sc.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= amount;
                        System.out.println("Payment completed.");
                        System.out.println("Current Balance: Rs. " + balance);
                    }
                    break;

                case 3:
                    System.out.printf("Current Balance: Rs. %.2f\n", balance);
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
	}
}
