package class31;

import java.util.ArrayList;

public class Taks3 {

	public static void main(String[] args) {
		
		ArrayList<String> drinks=new ArrayList<>();
		drinks.add("tea");
		drinks.add("coffee");
		drinks.add("milk");
		drinks.add("soda");
		
		for (int i=0; i<drinks.size(); i++) {
			String drink=drinks.get(i);
			if(drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}
}
