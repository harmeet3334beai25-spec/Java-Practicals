package day2;

import java.util.Scanner;

public class OrderBill {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();
        while (price < 0) {
            System.out.print("Invalid! Enter a positive price: ");
            price = sc.nextDouble();
        }

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        while (quantity <= 0) {
            System.out.print("Invalid! Enter quantity greater than 0: ");
            quantity = sc.nextInt();
        }

        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();
        while (deliveryCharge < 0) {
            System.out.print("Invalid! Enter a positive delivery charge: ");
            deliveryCharge = sc.nextDouble();
        }

        System.out.print("Enter Discount Percentage: ");
        double discountPercentage = sc.nextDouble();
        while (discountPercentage < 0 || discountPercentage > 100) {
            System.out.print("Invalid! Enter discount between 0 and 100: ");
            discountPercentage = sc.nextDouble();
        }

        double subtotal = price * quantity;
        double discount = subtotal * discountPercentage / 100;
        double amountAfterDiscount = subtotal - discount;
        double finalAmount = amountAfterDiscount + deliveryCharge;
        
        System.out.println("\nORDER BILL");
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("Discount: Rs. %.2f\n", discount);
        System.out.printf("Delivery Charge: Rs. %.2f\n", deliveryCharge);
        System.out.printf("Final Payable Amount: Rs. %.2f\n", finalAmount);

        sc.close();
    }
}
