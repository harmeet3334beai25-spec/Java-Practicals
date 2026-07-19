package day1;

import java.util.Scanner;

public class LabReadinessChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student name:");
		String name = sc.nextLine();
		System.out.println("Laboratory name:");
		String lab = sc.nextLine();
		
		System.out.println("JAVA LAB READINESS CHECK");
		System.out.println("Student Name:"+name);
		System.out.println("Status:Java environment is ready.");
		System.out.println("Compile:javac LabReadinessChecker.java");
		System.out.println("java LabReadinessChecker");
		

	}

}
