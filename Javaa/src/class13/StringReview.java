package class13;

public class StringReview {

	public static void main(String[] args) {
		/*
		 * 
Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.

		 */

		String day =new String("Thursday!");
		
		if (!day.isEmpty()) {
			if (day.length()%2!=0 && day.length()>=3) {
				System.out.println(day.charAt(day.length()/2));
			}
		}
		
	}
}
