package class11;

public class Task2 {
	/*Create an array of countries. While retrieving all values from an array print
	 * capital for each country.*/
	public static void main(String[] args) {

		String[] array = { "USA", "Russia", "Turkey", "Spain" };
		for (int i = 0; i < array.length; i++) {

			if (array[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (array[i].equals("Russia")) {
				System.out.println("Moscow");
			} else if (array[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (array[i].equals("Spain")) {
				System.out.println("Madrid");
			}
		}

		String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
		for (String country : contries) {//1.country=USA 2.country=Afghanistan

			switch (country) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Kazakhstan":
				System.out.println("Astana");
				break;
			case "Ukraine":
				System.out.println("Kiev");
				break;
			}
		}
	}
}
