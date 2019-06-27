package class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Program to find largest number among three numbers using nested if 
		 * provided by a user (numbers must be distinct)
		 */

		int num1, num2, num3,largest =0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		//if number are NOT equal
		if (!(num1==num2 && num1==num3 && num2==num3)) {
					if (num1>num2) {
								if (num1>num3) {
									largest=num1;
								}else {
									largest=num3;
								}
					}else { //assuming num2>num1
						
								if (num2>num3) {
									largest=num2;
								}else {
									largest=num3;
								}
					}
		}else {
			System.out.println("All numbers are equal");
		}
		
		System.out.println("The largest number is "+largest);
	}
}
