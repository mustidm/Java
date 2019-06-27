package class10;

public class Task3 {
	public static void main(String[] args) {
		/*
		 * Print the following pattern: 1 12 123 1234 12345
		 */

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=4; i++) {
			for (int y=4; y>=i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//break till 11: 50
	}
}
