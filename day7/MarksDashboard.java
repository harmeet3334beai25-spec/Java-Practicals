package day7;

import java.util.Scanner;

public class MarksDashboard {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < marks.length; i++) {

            while (true) {
                System.out.print("Enter marks of Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                }
            }
        }

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];

            if (marks[i] >= 40) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = total / 5.0;

        System.out.println("\nMARKS DASHBOARD");
        System.out.print("Marks: ");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Passed Subjects: " + passed);
        System.out.println("Failed Subjects: " + failed);

        sc.close();
    }
}
	
