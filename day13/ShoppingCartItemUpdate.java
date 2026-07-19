package day13;

import java.util.Scanner;

class CartItem {

    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("\nCART ITEM");
        System.out.println("Item Name        : " + itemName);
        System.out.printf("Unit Price       : Rs. %.2f\n", unitPrice);
        System.out.println("Updated Quantity : " + quantity);
        System.out.printf("Current Total    : Rs. %.2f\n", calculateAmount());
    }
}

public class ShoppingCartItemUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        double unitPrice;
        do {
            System.out.print("Enter Unit Price: ");
            unitPrice = sc.nextDouble();

            if (unitPrice <= 0)
                System.out.println("Unit Price must be greater than 0.");
        } while (unitPrice <= 0);

        int quantity;
        do {
            System.out.print("Enter Initial Quantity: ");
            quantity = sc.nextInt();

            if (quantity <= 0)
                System.out.println("Quantity must be greater than 0.");
        } while (quantity <= 0);

        CartItem item = new CartItem(itemName, unitPrice, quantity);

        int newQuantity;
        do {
            System.out.print("Enter Updated Quantity: ");
            newQuantity = sc.nextInt();

            if (newQuantity <= 0)
                System.out.println("Quantity must be greater than 0.");
        } while (newQuantity <= 0);

        item.updateQuantity(newQuantity).display();

        sc.close();
    }
}