package day3;

import java.util.Scanner;

public class CollegeAdmissionProfile {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		 // Input Section
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter you rollno:");
		int rollno = sc.nextInt();
		
		System.out.print("Enter Semester (1-8): ");
        int semester = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Programme: ");
        String programme = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

     // Output Section
        
        System.out.println("    ADMISSION PROFILE");
        
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollno);
        System.out.println("Programme   : " + programme);
        System.out.println("Semester    : " + semester);
        System.out.println("Email       : " + email);
        System.out.println("City        : " + city);
        
		
	}
}
