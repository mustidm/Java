package class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner;
		int quiz;
		int midTerm;
		int finalGrade;
		int average;
		
		scanner = new Scanner(System.in);
		System.out.println("Please enter quiz score: ");
		quiz = scanner.nextInt();
		
		System.out.println("Please enter mid term score: ");
		midTerm = scanner.nextInt();
		
		System.out.println("Please enter final score: ");
		finalGrade = scanner.nextInt();
		
		average=(quiz+midTerm+finalGrade)/3;

		System.out.println("Average score is "+average);
		
		if (average >= 90) {
			System.out.println("Your Grade is A");
		} else if (average >= 70 && average < 90) {//false OR true-->true
			System.out.println("Your Grade is B");
		} else if (average >= 50 && average < 70) {
			System.out.println("Your Grade is C");
		} else if (average < 50) {
			System.out.println("Your Grade is F");
		}
//break 2 pm
	}

}
