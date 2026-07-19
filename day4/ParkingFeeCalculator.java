package day4;

import java.util.Scanner;

public class ParkingFeeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vehicle Types");
		System.out.println("1. Two-Wheeler");
		System.out.println("2. Car");
		
		System.out.println("Enter vehicle type: ");
		int type = sc.nextInt();
		
		System.out.print("Enter Parking Hours (1-12): ");
        int hours = sc.nextInt();

        if (hours < 1 || hours > 12) {
            System.out.println("Invalid parking hours! Hours must be between 1 and 12.");
        } else {

            int fee = 0;
            String vehicle = "";

            switch (type) {
                case 1:
                    vehicle = "Two-Wheeler";
                    if (hours == 1) {
                        fee = 10;
                    } else {
                        fee = 10 + (hours - 1) * 5;
                    }
                    break;

                case 2:
                    vehicle = "Car";
                    if (hours == 1) {
                        fee = 20;
                    } else {
                        fee = 20 + (hours - 1) * 10;
                    }
                    break;

                default:
                    System.out.println("Invalid Vehicle Type!");
                    sc.close();
                    return;
            }
            
            System.out.println("\nPARKING FEE");
            System.out.println("Vehicle : " + vehicle);
            System.out.println("Hours   : " + hours);
            System.out.println("Fee     : Rs." + fee);
        }

        sc.close();

		

	}

}
