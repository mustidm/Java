package class03;

public class MultipleConditions {

	public static void main(String[] args) {
		/*
		 * Create a Java program and declare int variable that will hold a day. 
		 * Based on the value of the variable your program should print 
		 * the name of the day.
		 */
		int day=5;
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thurday");
		}else if (day==5) {
			System.out.println("Friday -fun day");
		} else if (day==6) {
			System.out.println("Saturday - code day");
		}else if (day==7){
			System.out.println("Sunday");
		}else {
			System.out.println("I am do not know what you mean");
		}
		
	}
}
