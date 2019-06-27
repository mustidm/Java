package class08;

import java.util.Scanner;

public class HomeWork {
	/*
	 * Ask user to enter the item they want to buy and the price for the item. Then
	 * as user to pay for it every time user enters money accumulate the amount
	 * until it reaches the needed amount. if user gives more money than needed give
	 * back change "Please enjoy your __"
	 */

	public static void main(String[] args) {

		Scanner scan;
		String item;
		double price;
		double money;
		double total = 0;
		double needMore;

		scan = new Scanner(System.in);

		System.out.println("Please enter the item you want to purchase");
		item = scan.nextLine();
		System.out.println("Please enter the cost of the item");
		price = scan.nextDouble();
		do {
			System.out.println("Please pay for your item");

			money = scan.nextDouble();

			total = total + money;
			
			needMore=price-total;
			System.out.println("Please add more "+needMore);

		} while (total != price);

		System.out.println("Please enjoy your " + item);

	}
}
