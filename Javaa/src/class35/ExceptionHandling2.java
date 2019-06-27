package class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		System.out.println("Begining of the code");

		int a = 10;
		int b = 10;
		
		try {
			System.out.println(a / b);
			System.out.println("Code inside try block");
			
		} catch (ArithmeticException e) {
			
			System.out.println("Code inside catch block");
		}
		
		System.out.println("The end of the program");
		//BREAK TILL 11;50
	}
}
