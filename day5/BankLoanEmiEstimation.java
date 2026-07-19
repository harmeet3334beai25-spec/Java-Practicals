package day5;

import java.util.Scanner;

public class BankLoanEmiEstimation {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal Amount: ");
	        double principal = sc.nextDouble();

	        System.out.print("Enter Annual Interest Rate (%): ");
	        double rate = sc.nextDouble();

	        System.out.print("Enter Loan Period (Years): ");
	        double years = sc.nextDouble();

	        System.out.print("Enter Number of Months: ");
	        int months = sc.nextInt();

	        if (principal <= 0 || rate <= 0 || years <= 0 || months <= 0) {
	            System.out.println("Invalid input! All values must be greater than 0.");
	        } else {

	            double interest = calculateInterest(principal, rate, years);
	            double totalPayable = calculateTotalPayable(principal, interest);
	            double monthlyInstallment = calculateMonthlyInstallment(totalPayable, months);

	            System.out.println("\nLOAN ESTIMATE");
	            System.out.printf("Simple Interest: Rs. %.2f\n", interest);
	            System.out.printf("Total Payable: Rs. %.2f\n", totalPayable);
	            System.out.printf("Monthly Instalment: Rs. %.2f\n", monthlyInstallment);
	        }


	}

	private static double calculateMonthlyInstallment(double totalPayable, int months) {
		return totalPayable / months;
	}

	private static double calculateTotalPayable(double principal, double interest) {
		return principal + interest;
	}

	private static double calculateInterest(double principal, double rate, double years) {	
		return (principal * rate * years) / 100;
	}

}
