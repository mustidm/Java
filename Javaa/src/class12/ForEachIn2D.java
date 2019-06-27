package class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*Create a grocery list: fruits{}
		 * 						veggies{}
		 * 						dairy{}
		 * Retrieve all values using 2 different loops
		 */

		String[][] groceryList= {
				{"banana", "orange", "apple"},
				{"onion", "potato", "cucumber"},
				{"yogurt", "cheese", "milk"}
		};
		
		for(String[] list:groceryList) {
			
			for(String item:list) {
				
				System.out.println(item);
			}
		}
		//BREAK TILL 11:25
		
	}
}
