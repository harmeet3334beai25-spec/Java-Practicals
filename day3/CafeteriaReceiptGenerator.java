package day3;

import java.util.Scanner;

public class CafeteriaReceiptGenerator {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Unit Price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter GST Rate (%): ");
        double gstRate = sc.nextDouble();

        if (unitPrice < 0 || quantity <= 0 || gstRate < 0) {
            System.out.println("\nInvalid Input!");
            System.out.println("Unit Price and GST Rate cannot be negative.");
            System.out.println("Quantity must be greater than 0.");
        } else {

            double subtotal = unitPrice * quantity;
            double gst = subtotal * gstRate / 100;
            double grandTotal = subtotal + gst;
           
            System.out.println("     CAFETERIA RECEIPT");
            System.out.println("Item      : " + itemName);
            System.out.printf("Subtotal  : Rs. %.2f%n", subtotal);
            System.out.printf("GST       : Rs. %.2f%n", gst);
            System.out.printf("Grand Total : Rs. %.2f%n", grandTotal);

        }


	}

}
