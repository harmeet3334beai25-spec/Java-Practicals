package day14;

import java.util.Scanner;

class Learner {

    String learnerId;
    String name;
    double courseFee;
    double amountPaid;
    int[] attendance;

    Learner(String learnerId, String name, double courseFee, double amountPaid, int[] attendance) {
        this.learnerId = learnerId;
        this.name = name;
        this.courseFee = courseFee;
        this.amountPaid = amountPaid;
        this.attendance = attendance;
    }
    double calculatePendingFee() {
        return courseFee - amountPaid;
    }

    double calculateAttendancePercentage() {
        int present = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1)
                present++;
        }

        return (present * 100.0) / attendance.length;
    }

    String isCertificateEligible() {

        if (calculatePendingFee() > 0)
            return "Not Eligible (Fee Pending)";
        else if (calculateAttendancePercentage() < 75)
            return "Not Eligible (Attendance Shortage)";
        else
            return "Eligible";
    }

    void displayReport() {

        System.out.println("\nLEARNER REPORT");
        System.out.println("ID                  : " + learnerId);
        System.out.println("Name                : " + name);
        System.out.printf("Pending Fee         : Rs. %.2f\n", calculatePendingFee());
        System.out.printf("Attendance          : %.2f%%\n", calculateAttendancePercentage());
        System.out.println("Certificate Status  : " + isCertificateEligible());
    }
}


public class TrainingCentreFeeAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Learners: ");
        int n = sc.nextInt();
        sc.nextLine();

        Learner[] learners = new Learner[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Learner " + (i + 1));

            System.out.print("Learner ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            double fee;
            do {
                System.out.print("Course Fee: ");
                fee = sc.nextDouble();

                if (fee < 0)
                    System.out.println("Invalid Course Fee.");
            } while (fee < 0);

            double paid;
            do {
                System.out.print("Amount Paid: ");
                paid = sc.nextDouble();

                if (paid < 0 || paid > fee)
                    System.out.println("Amount Paid should be between 0 and Course Fee.");
            } while (paid < 0 || paid > fee);

            int[] attendance = new int[7];

            System.out.println("Enter Attendance for 7 Sessions (1 = Present, 0 = Absent)");

            for (int j = 0; j < 7; j++) {

                do {
                    System.out.print("Session " + (j + 1) + ": ");
                    attendance[j] = sc.nextInt();

                    if (attendance[j] != 0 && attendance[j] != 1)
                        System.out.println("Enter only 0 or 1.");

                } while (attendance[j] != 0 && attendance[j] != 1);
            }

            sc.nextLine();

            learners[i] = new Learner(id, name, fee, paid, attendance);
        }

        System.out.println("\n========== LEARNER REPORT ==========");

        for (int i = 0; i < learners.length; i++) {
            learners[i].displayReport();
        }

        sc.close();
    }
}