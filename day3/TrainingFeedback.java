package day3;

import java.util.Scanner;

public class TrainingFeedback {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Content Rating (1-5): ");
        int content = sc.nextInt();

        System.out.print("Explanation Rating (1-5): ");
        int explanation = sc.nextInt();

        System.out.print("Practical Rating (1-5): ");
        int practical = sc.nextInt();

        if (content < 1 || content > 5 ||
            explanation < 1 || explanation > 5 ||
            practical < 1 || practical > 5) {

            System.out.println("Invalid rating! Ratings must be between 1 and 5.");
        } else {

            int total = content + explanation + practical;
            double average = total / 3.0;

            System.out.println("\nTRAINING FEEDBACK");
            System.out.println("Student Name : " + name);
            System.out.println("Content      : " + content + "/5");
            System.out.println("Explanation  : " + explanation + "/5");
            System.out.println("Practical    : " + practical + "/5");
            System.out.printf("Average Rating: %.2f/5", average);
        }

        sc.close();
    }
	
}
