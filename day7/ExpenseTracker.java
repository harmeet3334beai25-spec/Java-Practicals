package day7;

import java.util.Scanner;

public class ExpenseTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        double total = 0;
        int aboveBudget = 0;
        
        for (int i = 0; i < expenses.length; i++) {

            while (true) {
                System.out.print("Enter expense for Day " + (i + 1) + ": Rs. ");
                expenses[i] = sc.nextDouble();

                if (expenses[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid expense! Enter a value greater than or equal to 0.");
                }
            }
        }
        
        System.out.print("Enter Daily Budget Limit: Rs. ");
        double budget = sc.nextDouble();

        if (budget < 0) {
            System.out.println("Invalid budget! Budget must be greater than or equal to 0.");
        } else {

            
            for (int i = 0; i < expenses.length; i++) {
                total = total + expenses[i];

                if (expenses[i] > budget) {
                    aboveBudget++;
                }
            }

            double average = total / expenses.length;
            
            System.out.println("\nEXPENSE REPORT");

            System.out.printf("Total Spending: Rs. %.2f\n", total);
            System.out.printf("Average Daily Spending: Rs. %.2f\n", average);
            System.out.println("Days Above Budget: " + aboveBudget);
        }


	}

}
