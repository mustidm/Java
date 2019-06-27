package class10;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
/*
 * Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
 *  As soon as the user enters the correct leap year exit the loop.
 *  
 *  Leap year is the that 
 */

		Scanner scan;
		int year;
		
		scan=new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Please enter a guessed leap year");
			year=scan.nextInt();
			
			if (year%4==0) {
				System.out.println("The year is a leap year");
				break;
			}else {
				System.out.println("The year is NOT a leap year");
			}
			
		}
		
	}
}
