package day9;

import java.util.Scanner;

public class QuizResponseEvaluation {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        char[] answerKey = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};

        char[] responses = new char[10];

        System.out.println("Enter Student Responses (A/B/C/D/X):");

        for (int i = 0; i < responses.length; i++) {

            while (true) {
                System.out.print("Question " + (i + 1) + ": ");
                responses[i] = Character.toUpperCase(sc.next().charAt(0));

                if (responses[i] == 'A' || responses[i] == 'B' ||
                    responses[i] == 'C' || responses[i] == 'D' ||
                    responses[i] == 'X') {
                    break;
                } else {
                    System.out.println("Invalid input! Enter A, B, C, D or X.");
                }
            }
        }
        int correct = 0;
        int incorrect = 0;
        int unattempted = 0;

        for (int i = 0; i < answerKey.length; i++) {

            if (responses[i] == 'X') {
                unattempted++;
            } else if (responses[i] == answerKey[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }
        int score = correct * 1;

        System.out.println("\nQUIZ RESULT");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.println("Unattempted: " + unattempted);
        System.out.println("Score: " + score);
	}

}
