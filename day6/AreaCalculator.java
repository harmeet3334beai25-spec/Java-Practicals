package day6;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result;
        
        switch (choice) {

            case 1:
                System.out.print("Enter Side: ");
                double side = sc.nextDouble();

                if (side <= 0) {
                    System.out.println("Invalid side!");
                } else {
                    result = area(side);

                    System.out.println("\nAREA RESULT");
                    System.out.println("Shape: Square");
                    System.out.printf("Area: %.2f square units\n", result);
                }
                break;

            case 2:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Width: ");
                double width = sc.nextDouble();

                if (length <= 0 || width <= 0) {
                    System.out.println("Invalid dimensions!");
                } else {
                    result = area(length, width);

                    System.out.println("\nAREA RESULT");
                    System.out.println("Shape: Rectangle");
                    System.out.printf("Area: %.2f square units\n", result);
                }
                break;

            case 3:
                System.out.print("Enter Radius: ");
                int radius = sc.nextInt();

                if (radius <= 0) {
                    System.out.println("Invalid radius!");
                } else {
                    result = area(radius);

                    System.out.println("\nAREA RESULT");
                    System.out.println("Shape: Circle");
                    System.out.printf("Area: %.2f square units\n", result);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }


	}

	private static double area(double length, double width) {
		return length * width;
	}

	private static double area(double side) {
		return side * side;
	}
	
	private static double area(int radius) {
        return 3.14 * radius * radius;
    }
}
