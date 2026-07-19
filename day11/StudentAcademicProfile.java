package day11;

import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int marks;
    int attendance;
    
    void readData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        do {
            System.out.print("Enter Marks (0-100): ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100)
                System.out.println("Invalid Marks! Enter between 0 and 100.");
        } while (marks < 0 || marks > 100);

        do {
            System.out.print("Enter Attendance (0-100): ");
            attendance = sc.nextInt();
            if (attendance < 0 || attendance > 100)
                System.out.println("Invalid Attendance! Enter between 0 and 100.");
        } while (attendance < 0 || attendance > 100);
    }

    String calculateResult() {
        if (marks >= 40)
            return "PASS";
        else
            return "FAIL";
    }
    
    void displayProfile() {
        System.out.println(rollNo + " - " + name +
                " - Marks: " + marks +
                " - Attendance: " + attendance + "%" +
                " - " + calculateResult());
    }
}


public class StudentAcademicProfile {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            students[i] = new Student();
            students[i].readData(sc);
        }

        System.out.println("\nSTUDENT PROFILES");
        for (int i = 0; i < n; i++) {
            students[i].displayProfile();
        }

        sc.close();
    }
}
