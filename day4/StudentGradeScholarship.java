package day4;

import java.util.Scanner;

public class StudentGradeScholarship {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter Attendance: ");
        double attendance = sc.nextDouble();

        if (percentage < 0 || percentage > 100 || attendance < 0 || attendance > 100) {
            System.out.println("Validation: Invalid input! Percentage and Attendance must be between 0 and 100.");
        } else {

            String grade;

            if (percentage >= 85) {
                grade = "A";
            } else if (percentage >= 75) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            String scholarship;
            if (percentage >= 85 && attendance >= 90) {
                scholarship = "Eligible";
            } else {
                scholarship = "Not Eligible";
            }

            System.out.println("\nACADEMIC DECISION");
            System.out.println("Grade: " + grade);
            System.out.println("Scholarship: " + scholarship);
            System.out.println("Validation: Input accepted");
        }

        sc.close();

	}

}
