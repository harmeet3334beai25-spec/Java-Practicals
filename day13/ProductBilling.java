package day13;

import java.util.Scanner;

class Product {

    String productId;
    String name;
    double price;
    int quantity;

    
    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("\nPRODUCT BILL");
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.printf("Price      : Rs. %.2f\n", price);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Total Value: Rs. %.2f\n", calculateTotalValue());
    }
}


public class ProductBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Product " + (i + 1));

            System.out.print("Enter Product ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            double price;
            do {
                System.out.print("Enter Price: ");
                price = sc.nextDouble();

                if (price <= 0)
                    System.out.println("Price must be greater than 0.");
            } while (price <= 0);

            int quantity;
            do {
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                if (quantity <= 0)
                    System.out.println("Quantity must be greater than 0.");
            } while (quantity <= 0);

            sc.nextLine();

            products[i] = new Product(id, name, price, quantity);
        }

        System.out.println("\n******** PRODUCT DETAILS ********");

        for (int i = 0; i < n; i++) {
            products[i].displayProduct();
        }

        sc.close();
    }
}