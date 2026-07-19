package day7;

import java.util.Scanner;

public class WeeklyAttendence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int presentDays = 0;
        
        for (int i = 0; i < attendance.length; i++) {

            while (true) {
                System.out.print("Enter attendance for Day " + (i + 1) + " (1 = Present, 0 = Absent): ");
                attendance[i] = sc.nextInt();

                if (attendance[i] == 0 || attendance[i] == 1) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter only 0 or 1.");
                }
            }
        }
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1) {
                presentDays++;
            }
        }
        
        int absentDays = attendance.length - presentDays;
        double percentage = (presentDays * 100.0) / attendance.length;

        System.out.println("\nWEEKLY ATTENDANCE");

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1) {
                System.out.println("Day " + (i + 1) + ": Present");
            } else {
                System.out.println("Day " + (i + 1) + ": Absent");
            }
        }

        System.out.println("Present Days: " + presentDays);
        System.out.println("Absent Days: " + absentDays);
        System.out.printf("Attendance: %.2f%%\n", percentage);


	}

}
