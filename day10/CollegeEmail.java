package day10;

import java.util.Scanner;

public class CollegeEmail {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Required Domain: ");
        String domain = sc.nextLine();

        email = email.trim();
        domain = domain.trim();

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        
        if (firstAt <= 0) {
            System.out.println("\nEMAIL VALIDATION");
            System.out.println("Email: " + email);
            System.out.println("Status: Invalid Email");
        } 
        else if (firstAt != lastAt) {
            System.out.println("\nEMAIL VALIDATION");
            System.out.println("Email: " + email);
            System.out.println("Status: Invalid Email (More than one @ symbol)");
        } 
        else if (!email.endsWith(domain)) {
            System.out.println("\nEMAIL VALIDATION");
            System.out.println("Email: " + email);
            System.out.println("Status: Invalid College Email");
        } 
        else {
            System.out.println("\nEMAIL VALIDATION");
            System.out.println("Email: " + email);
            System.out.println("Status: Valid College Email");
        }
}
}
