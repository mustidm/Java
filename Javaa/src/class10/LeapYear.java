package class10;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
	
		
	   Scanner scan=new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Please enter a guessed leap year");
		int	year=scan.nextInt();
			
			//if year is divisible by 400--> leap year
			//if year is divisible by 100--> not a leap year
			//if year is divisible by 4--> a leap year
			//(year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)--> same thing
			
			if (year%400==0) {
				System.out.println("Year is a leap year");
				break;
			}else if (year%4==0 && year%100!=0) {
				System.out.println("Year is a leap year");
				break;
			}else {
				System.out.println("Year is a NOT leap year");
			}
			
		}
	}
}
