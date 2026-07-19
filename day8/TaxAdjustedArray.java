package day8;

import java.util.Scanner;

public class TaxAdjustedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Items: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of items!");
            sc.close();
            return;
        }

        double[] prices = new double[n];
        
        for (int i = 0; i < prices.length; i++) {

            while (true) {
                System.out.print("Enter Price of Item " + (i + 1) + ": ");
                prices[i] = sc.nextDouble();

                if (prices[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid price! Enter a value greater than or equal to 0.");
                }
            }
        }
        
        System.out.print("Enter GST Percentage: ");
        double gst = sc.nextDouble();

        if (gst < 0) {
            System.out.println("Invalid GST percentage!");
        } else {

            double[] adjustedPrices = addTax(prices, gst);
            System.out.println("\nORIGINAL PRICES:");
            for (int i = 0; i < prices.length; i++) {
                System.out.printf("%.2f ", prices[i]);
            }

            System.out.println("\nGST-ADJUSTED PRICES:");
            for (int i = 0; i < adjustedPrices.length; i++) {
                System.out.printf("%.2f ", adjustedPrices[i]);
            }
        }
	}

	private static double[] addTax(double[] prices, double taxRate) {

	    double[] adjustedPrices = new double[prices.length];

	    for (int i = 0; i < prices.length; i++) {
	        adjustedPrices[i] = prices[i] + (prices[i] * taxRate / 100);
	    }

	    return adjustedPrices;
	}
}

