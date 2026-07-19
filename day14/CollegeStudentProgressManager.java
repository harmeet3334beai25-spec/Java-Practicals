package day14;

import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int[] marks;
    int attendance;

    Student(int rollNo, String name, int[] marks, int attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    String getResult() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                return "FAIL";
            }
        }
        return "PASS";
    }

    String getAttendanceStatus() {
        if (attendance >= 75)
            return "Satisfactory";
        else
            return "Shortage";
    }

    void display() {
        System.out.printf("%d %s - Total: %d, Average: %.2f, Result: %s, Attendance: %s\n",
                rollNo, name, calculateTotal(), calculateAverage(),
                getResult(), getAttendanceStatus());
    }
}



public class CollegeStudentProgressManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        int classTotal = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            System.out.println("Enter Marks of 5 Subjects:");

            for (int j = 0; j < 5; j++) {

                do {
                    System.out.print("Subject " + (j + 1) + ": ");
                    marks[j] = sc.nextInt();

                    if (marks[j] < 0 || marks[j] > 100)
                        System.out.println("Marks should be between 0 and 100.");

                } while (marks[j] < 0 || marks[j] > 100);
            }

            int attendance;

            do {
                System.out.print("Attendance (%): ");
                attendance = sc.nextInt();

                if (attendance < 0 || attendance > 100)
                    System.out.println("Attendance should be between 0 and 100.");

            } while (attendance < 0 || attendance > 100);

            students[i] = new Student(roll, name, marks, attendance);

            classTotal += students[i].calculateTotal();
        }

        System.out.println("\n========== CLASS REPORT ==========");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        System.out.println("\nClass Total Marks = " + classTotal);
        System.out.printf("Class Average Marks = %.2f\n",
                (double) classTotal / n);

        sc.close();
    }
}
