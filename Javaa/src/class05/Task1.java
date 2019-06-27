package class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter heights in inches. Person should be classified as
		 * one of the following: • short (under 5 feet) • medium(5 to 6 feet) • tall (6
		 * feet and over)
		 */

		Scanner inc = new Scanner(System.in);
		System.out.println("Please enter your height");
		double height = inc.nextDouble();

		if (height == 5 && height < 6) {
			System.out.println("Medium");
		} else if (height < 5) {
			System.out.println("Short");
		} else if (height >= 6) {
			System.out.println("Tall");
		} else {
			System.out.println("Please enter valid height");
		}

	}
}
