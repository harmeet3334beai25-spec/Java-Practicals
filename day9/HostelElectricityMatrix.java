package day9;

import java.util.Scanner;

public class HostelElectricityMatrix {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] units = new int[4][7];

        for (int i = 0; i < units.length; i++) {
            System.out.println("Enter units for Room " + (i + 1) + ":");

            for (int j = 0; j < units[i].length; j++) {

                while (true) {
                    System.out.print("Day " + (j + 1) + ": ");
                    units[i][j] = sc.nextInt();

                    if (units[i][j] >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid units! Enter a value greater than or equal to 0.");
                    }
                }
            }
        }

        int hostelTotal = 0;

        System.out.println("\nHOSTEL ELECTRICITY REPORT");

        for (int i = 0; i < units.length; i++) {

            int roomTotal = 0;
            for (int j = 0; j < units[i].length; j++) {
                roomTotal = roomTotal + units[i][j];
            }

            hostelTotal = hostelTotal + roomTotal;
            System.out.println("Room " + (i + 1) + " Weekly Units: " + roomTotal);
        }
        System.out.println("Total Hostel Consumption: " + hostelTotal + " units");
	}
}
