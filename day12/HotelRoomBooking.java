package day12;

import java.util.Scanner;

class Room {

    int roomNumber;
    String roomType;
    double dailyRate;
    boolean available;

    Room(int roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        available = true;
    }

    void bookRoom(int days) {
        if (!available) {
            System.out.println("Room is already booked.");
        } else {
            available = false;
            double amount = dailyRate * days;

            System.out.println("\nBOOKING DETAILS");
            System.out.println("Room Number : " + roomNumber);
            System.out.println("Room Type   : " + roomType);
            System.out.println("Stay Days   : " + days);
            System.out.printf("Total Amount: Rs. %.2f\n", amount);
            System.out.println("Status      : Booked");
        }
    }

    void display() {
        System.out.println("\nROOM DETAILS");
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + roomType);
        System.out.printf("Daily Rate  : Rs. %.2f\n", dailyRate);

        if (available)
            System.out.println("Availability: Available");
        else
            System.out.println("Availability: Booked");
    }
}


public class HotelRoomBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details of Room 1");

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Room Type: ");
        String type = sc.nextLine();

        double rate;
        do {
            System.out.print("Enter Daily Rate: ");
            rate = sc.nextDouble();
            if (rate <= 0)
                System.out.println("Daily rate must be greater than 0.");
        } while (rate <= 0);

        Room room1 = new Room(roomNo, type, rate);

        int days;
        do {
            System.out.print("Enter Stay Days: ");
            days = sc.nextInt();
            if (days <= 0)
                System.out.println("Stay days must be greater than 0.");
        } while (days <= 0);

        room1.bookRoom(days);

        room1.bookRoom(days);

        room1.display();

        System.out.println("\nEnter Details of Room 2");

        System.out.print("Enter Room Number: ");
        roomNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Room Type: ");
        type = sc.nextLine();

        do {
            System.out.print("Enter Daily Rate: ");
            rate = sc.nextDouble();
            if (rate <= 0)
                System.out.println("Daily rate must be greater than 0.");
        } while (rate <= 0);

        Room room2 = new Room(roomNo, type, rate);

        room2.display();

        sc.close();
    }
}