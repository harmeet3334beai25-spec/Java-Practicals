package day6;

import java.util.Scanner;

public class CourierChargeCalculator {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Delivery Types");
        System.out.println("1. Local");
        System.out.println("2. Outstation");

        System.out.print("Enter Delivery Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        if (weight <= 0) {
            System.out.println("Invalid weight! Weight must be greater than 0.");
        } else {

            double charge;

            if (type == 1) {
                charge = calculateCharge(weight);

                System.out.println("\nCOURIER CHARGE");
                System.out.println("Delivery : Local");
                System.out.println("Weight   : " + weight + " kg");
                System.out.printf("Charge   : Rs. %.2f\n", charge);

            } else if (type == 2) {

                System.out.print("Enter Distance (km): ");
                double distance = sc.nextDouble();

                if (distance <= 0) {
                    System.out.println("Invalid distance! Distance must be greater than 0.");
                } else {
                    charge = calculateCharge(weight, distance);

                    System.out.println("\nCOURIER CHARGE");
                    System.out.println("Delivery : Outstation");
                    System.out.println("Weight   : " + weight + " kg");
                    System.out.println("Distance : " + distance + " km");
                    System.out.printf("Charge   : Rs. %.2f\n", charge);
                }

            } else {
                System.out.println("Invalid Delivery Type!");
            }
        }
	}

	private static double calculateCharge(double weight, double distance) {
		return 50 + (weight * 20) + (distance * 1.5);
	}

	private static double calculateCharge(double weight) {
		return 50 + (weight * 20);
	}

}
