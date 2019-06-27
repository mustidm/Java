package class06;

import java.util.Scanner;

public class repl {

	public static void main(String[] args) {
		Scanner scan;
		int int1, int2;
		String word1, word2;

		scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		word1 = scan.nextLine();
		word2 = scan.nextLine();

		System.out.println("Please enter two numbers");
		int1 = scan.nextInt();
		int2 = scan.nextInt();

		if (word1.equals(word2) && int1 == int2) {
			System.out.println("AND");
		} else if (word1.equals(word2) || int1 == int2) {
			System.out.println("OR");
		} else if (!(word1.equals(word2) && int1 == int2)) {
			System.out.println("NONE");

		}
	}
}
