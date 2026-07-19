package day10;

import java.util.Scanner;

public class StudentNameFormatter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine().trim();

        System.out.print("Enter Middle Name: ");
        String middle = sc.nextLine().trim();

        System.out.print("Enter Last Name: ");
        String last = sc.nextLine().trim();

        if (first.length() == 0 || middle.length() == 0 || last.length() == 0) {
            System.out.println("Invalid input! Name fields cannot be empty.");
        } else {

            first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
            middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
            last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

            String fullName = first + " " + middle + " " + last;

            String initials = first.charAt(0) + ". " + middle.charAt(0) + ". " + last;

            System.out.println("\nFormatted Name: " + fullName);
            System.out.println("Initial Format: " + initials);
        }

	}

}
