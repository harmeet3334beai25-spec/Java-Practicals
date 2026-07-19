package day12;

import java.util.Scanner;

class Enrollment {

    String enrollmentId;
    String learnerName;
    String courseName;
    double fee;
    String paymentStatus;

    Enrollment(String enrollmentId, String learnerName, String courseName,
               double fee, String paymentStatus) {

        this.enrollmentId = enrollmentId;
        this.learnerName = learnerName;
        this.courseName = courseName;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    Enrollment(String enrollmentId, String learnerName, String courseName,
               double fee) {

        this(enrollmentId, learnerName, courseName, fee, "Pending");
    }

    void display() {
        System.out.println("\nENROLLMENT RECORD");
        System.out.println("ID             : " + enrollmentId);
        System.out.println("Learner        : " + learnerName);
        System.out.println("Course         : " + courseName);
        System.out.printf("Fee            : Rs. %.2f\n", fee);
        System.out.println("Payment Status : " + paymentStatus);
    }
}



public class CourseEnrollmentRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details of Enrollment 1");

        System.out.print("Enter Enrollment ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Learner Name: ");
        String learner = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        double fee;
        do {
            System.out.print("Enter Course Fee: ");
            fee = sc.nextDouble();

            if (fee < 0)
                System.out.println("Fee cannot be negative.");
        } while (fee < 0);

        Enrollment e1 = new Enrollment(id, learner, course, fee);

        sc.nextLine();

        System.out.println("\nEnter Details of Enrollment 2");

        System.out.print("Enter Enrollment ID: ");
        id = sc.nextLine();

        System.out.print("Enter Learner Name: ");
        learner = sc.nextLine();

        System.out.print("Enter Course Name: ");
        course = sc.nextLine();

        do {
            System.out.print("Enter Course Fee: ");
            fee = sc.nextDouble();

            if (fee < 0)
                System.out.println("Fee cannot be negative.");
        } while (fee < 0);

        sc.nextLine();

        System.out.print("Enter Payment Status: ");
        String status = sc.nextLine();

        Enrollment e2 = new Enrollment(id, learner, course, fee, status);

        System.out.println("\n******** ENROLLMENT DETAILS ********");

        e1.display();
        e2.display();

        sc.close();
    }
}
