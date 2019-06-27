package class04;

import java.util.Scanner;

public class CityAndTemperature {
/*
 * Ask user to enter city and temperature in Fahrenheit
 * Your program should convert F-->C
 * Your program should say "The temperature in the city ___is ___"
 */
	public static void main(String[] args) {
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName=myScanner.nextLine();
		
		System.out.println("Please enter temperature in Fahrenheit");
		temp=myScanner.nextInt();
		//formula (F − 32) × 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("the temperature in the city "+cityName+" is "
													+convertedTemp+"C");
		
	}
}
