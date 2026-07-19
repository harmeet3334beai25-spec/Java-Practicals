package day8;

import java.util.Scanner;

public class MonthlySales {

	public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
	        
	        double[] sales = new double[12];

	        readSales(sales);

	        System.out.print("Enter Sales Target: Rs. ");
	        double target = sc.nextDouble();

	        if (target < 0) {
	            System.out.println("Invalid target!");
	        } else {

	            // Processing
	            double total = calculateTotal(sales);
	            double average = calculateAverage(sales);
	            int targetMonths = countTargetMonths(sales, target);

	            // Output
	            System.out.println("\nSALES PERFORMANCE");
	            System.out.printf("Annual Sales: Rs. %.2f\n", total);
	            System.out.printf("Average Monthly Sales: Rs. %.2f\n", average);
	            System.out.println("Months Achieving Target: " + targetMonths);
	        }
	}

	private static int countTargetMonths(double[] sales, double target) {
		int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= target) {
                count++;
            }
        }

		return count;
	}

	private static double calculateAverage(double[] sales) {
		double total = calculateTotal(sales);
        return total / sales.length;
	}

	private static double calculateTotal(double[] sales) {
		double total = 0;

        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
		return total;
	}

	private static void readSales(double[] sales) {
		Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sales.length; i++) {
            while (true) {
                System.out.print("Enter Sales for Month " + (i + 1) + ": Rs. ");
                sales[i] = sc.nextDouble();

                if (sales[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid sales amount! Enter a value greater than or equal to 0.");
                }
            }
        }
		
	}

}
