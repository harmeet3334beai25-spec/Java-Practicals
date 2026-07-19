package day6;

import java.util.Scanner;

public class ElectricityConsumption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Consumer Types");
        System.out.println("1. Room");
        System.out.println("2. Laboratory");

        System.out.print("Enter Consumer Type: ");
        int type = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();
        
        if (units <= 0) {
            System.out.println("Invalid units! Units must be greater than 0.");
        } else {

            double energyCharge = units * 6.0;
            double totalCost;

            if (type == 1) {

                totalCost = calculateBill(units);

                System.out.println("\nELECTRICITY ESTIMATE");
                System.out.println("Type: Room");
                System.out.printf("Energy Charge: Rs. %.2f\n", energyCharge);
                System.out.printf("Total Cost: Rs. %.2f\n", totalCost);

            } else if (type == 2) {

                System.out.print("Enter Fixed Equipment Charge: Rs. ");
                double equipmentCharge = sc.nextDouble();

                if (equipmentCharge < 0) {
                    System.out.println("Invalid equipment charge!");
                } else {

                    totalCost = calculateBill(units, equipmentCharge);

                    // Output
                    System.out.println("\nELECTRICITY ESTIMATE");
                    System.out.println("Type: Laboratory");
                    System.out.printf("Energy Charge: Rs. %.2f\n", energyCharge);
                    System.out.printf("Equipment Charge: Rs. %.2f\n", equipmentCharge);
                    System.out.printf("Total Cost: Rs. %.2f\n", totalCost);
                }

            } else {
                System.out.println("Invalid Consumer Type!");
            }

	}

}

	private static double calculateBill(int units, double equipmentCharge) {
		
		return (units * 6.0) + equipmentCharge;
	}

	private static double calculateBill(int units) {
		
		return units * 6.0;
	}
}