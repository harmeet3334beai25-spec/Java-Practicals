package day5;

import java.util.Scanner;

public class FitnessCalorieRecommendation {
	public static void main(String[]args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Height (metres): ");
        double height = sc.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Invalid input! Weight and height must be greater than 0.");
        } else {

            double bmi = calculateBMI(weight, height);
            String category = getBMICategory(bmi);

            System.out.println("\nFITNESS REPORT");
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.println("Category: " + category);

            if (category.equals("Underweight")) {
                System.out.println("Recommendation: Increase nutritious food intake.");
            } else if (category.equals("Normal")) {
                System.out.println("Recommendation: Maintain regular exercise and balanced diet.");
            } else if (category.equals("Overweight")) {
                System.out.println("Recommendation: Exercise regularly and follow a healthy diet.");
            } else {
                System.out.println("Recommendation: Consult a doctor and follow a weight management plan.");
            }
        }
	}

	private static String getBMICategory(double bmi) {
		if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
	}

	private static double calculateBMI(double weight, double height) {
		return weight / (height * height);
	}
}
