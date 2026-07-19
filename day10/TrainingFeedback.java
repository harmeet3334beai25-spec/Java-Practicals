package day10;

import java.util.Scanner;

public class TrainingFeedback {
	public static void main(String[] args) {       
		Scanner sc = new Scanner(System.in);
	
        System.out.print("Enter Feedback: ");
        String feedback = sc.nextLine();

        feedback = feedback.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int otherSymbols = 0;

        for (int i = 0; i < feedback.length(); i++) {

            char ch = feedback.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (Character.isLetter(ch)) {
                consonants++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (Character.isWhitespace(ch)) {
                spaces++;
            }
            else {
                otherSymbols++;
            }
        }
        System.out.println("\nTEXT ANALYSIS");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Symbols: " + otherSymbols);

        sc.close();
    }
}
        
             