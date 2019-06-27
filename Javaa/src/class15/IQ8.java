package class15;

public class IQ8 {
/*
 * Write a Java Program to print first 10 numbers of Fibonacci series.
 */
	public static void main(String[] args) {
		

		int a=1;
		int b=0;
		int c=0;
		
		for(int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
	}
}
