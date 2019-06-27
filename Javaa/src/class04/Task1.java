package class04;

public class Task1 {

	/*
	 * Create a Java program and store variables to store mortgage rate and mortgage
	 * price. First program should check if rate is higher than 4.5 user will not
	 * buy a house, otherwise user will consider buying. Once user decides to buy a
	 * house, if price of the house is larger than 200000 than user will take a
	 * loan, otherwise user will pay cash.
	 */

	public static void main(String[] args) {

		double mortageRate = 4.8;
		int mortgagePrice = 300000;

		if (mortageRate > 4.5) {
			System.out.println("I am not buying the house");
		} else {
			System.out.println("I will consider buying the house");
			if (mortgagePrice >= 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}
		}

	}
}
