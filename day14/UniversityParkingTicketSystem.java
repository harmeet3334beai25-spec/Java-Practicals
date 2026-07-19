package day14;

import java.util.Scanner;

class Vehicle {

    String vehicleNumber;
    int vehicleType;

    Vehicle(String vehicleNumber, int vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    String getVehicleType() {
        if (vehicleType == 1)
            return "Two-wheeler";
        else if (vehicleType == 2)
            return "Car";
        else
            return "Other";
    }
}


class ParkingTicket {

    Vehicle vehicle;
    int hours;
    double fee;

    ParkingTicket(Vehicle vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
        calculateFee();
    }

    void calculateFee() {

        if (vehicle.vehicleType == 1)
            fee = hours * 20;
        else if (vehicle.vehicleType == 2)
            fee = hours * 30;
        else
            fee = hours * 40;
    }

    void displayTicket(int ticketNo) {

        System.out.println("\nTICKET " + ticketNo);
        System.out.println("Vehicle Number : " + vehicle.vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicle.getVehicleType());
        System.out.println("Hours Parked   : " + hours);
        System.out.printf("Parking Fee    : Rs. %.2f\n", fee);
    }

    double getFee() {
        return fee;
    }
}


public class UniversityParkingTicketSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        ParkingTicket[] tickets = new ParkingTicket[n];

        double totalRevenue = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Vehicle " + (i + 1));

            System.out.print("Vehicle Number: ");
            String number = sc.nextLine();

            int type;
            do {
                System.out.print("Vehicle Type (1-Two Wheeler, 2-Car, 3-Other): ");
                type = sc.nextInt();

                if (type < 1 || type > 3)
                    System.out.println("Invalid Vehicle Type.");

            } while (type < 1 || type > 3);

            int hours;
            do {
                System.out.print("Hours Parked: ");
                hours = sc.nextInt();

                if (hours <= 0)
                    System.out.println("Hours must be greater than 0.");

            } while (hours <= 0);

            sc.nextLine();

            Vehicle vehicle = new Vehicle(number, type);

            tickets[i] = new ParkingTicket(vehicle, hours);

            totalRevenue += tickets[i].getFee();
        }

        System.out.println("\n========== PARKING TICKETS ==========");

        for (int i = 0; i < n; i++) {
            tickets[i].displayTicket(i + 1);
        }

        System.out.printf("\nTotal Revenue: Rs. %.2f\n", totalRevenue);

        sc.close();
    }
}