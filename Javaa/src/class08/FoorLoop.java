package class08;

public class FoorLoop {

	public static void main(String[] args) {
		
		//initialize   condition/testCondition increment/decrement
		
		for (int i=1;  i<=10 ;  i++) {
			
			System.out.println("Good morning "+i);
		}
		
		/*I want to print numbers from 10 to 1*/
		

		for (int i=10; i>=1; i--) {
			
			System.out.println(i);
			
		}
		
		/*what is the output?*/
		
		for (int a=0; a<=20; a+=2) {
			
			System.out.println(a);
			
		}
		
		for (int b=5; b!=5; b++) {
			System.out.println(b);
		}
		
		
		
	}

}
