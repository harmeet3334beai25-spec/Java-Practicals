package day5;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();

        
        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 ||
            m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100) {

            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        } else {

            int total = calculateTotal(m1, m2, m3, m4, m5);
            double percentage = calculatePercentage(total, 500);
            boolean pass = isPassed(m1, m2, m3, m4, m5);

            System.out.println("\nSTUDENT RESULT");
            System.out.println("Total: " + total);
            System.out.printf("Percentage: %.2f%%\n", percentage);

            if (pass) {
                System.out.println("Status: PASS");
            } else {
                System.out.println("Status: FAIL");
            }

	}

}

	private static boolean isPassed(int m1, int m2, int m3, int m4, int m5) {
		 return (m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40 && m5 >= 40);
	}

	private static double calculatePercentage(int total, int maxMarks) {
		return (total * 100.0) / maxMarks;
	}

	private static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
		return m1 + m2 + m3 + m4 + m5;
	}
}
