package day2;

import java.util.Scanner;

public class ResultCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of 5 subjects:");
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        System.out.println("SEMESTER RESULT");
		int sum = (a+b+c+d+e);
		System.out.println("Total Marks:"+sum+"/500");
		float per = (sum/500.0f)*100;
		System.out.println("Percentage:"+per+"0%");
		
		boolean pass = (per >= 40);	
		
		
			

	}

}
