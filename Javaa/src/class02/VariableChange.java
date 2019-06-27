package class02;

public class VariableChange {

	public static void main(String[] args) {
		//Values of variables can be changed
		String name = "Jane";

		String lastName = "Smith";
		System.out.println(lastName);
		lastName = "Johson";

		char grade = 'B';
		// char grade='A'; do not work

		grade = 'A';
		// creating a variable & assigning the value
		String city = "Fairfax";
		// printing value of city
		System.out.println(city);
		// changing value of city from Fairfax to NY
		city = "New York";

		System.out.println(lastName);
		System.out.println(city);

	}
}
