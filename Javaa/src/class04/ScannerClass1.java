package class04;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		//ask user for the name and print Good morning __
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		 
		String name=input.nextLine();
		
		System.out.println("Good morning "+name);
		//break till 11:45
	}
}
