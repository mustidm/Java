package class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		int a=1;

		while (a<10) {
			System.out.println("Good morning"); //10 //9
			a++;
		}
		
		int b=1;
		
		while (b<=5) {
			System.out.println("I am inside while loop "+b); //6
			b++;
		}
		System.out.println("I am outside of while loop"); 
		
		//I want to print values from 10 to 20 inclusive;
		
		int z=10;
		while (z<=20) { 
			System.out.println(z);  //11 
			z++;
		}
		//I want to print values from 1 to 20 inclusive but all in 1 line with space;
		int q=1;
		
		while (q<=20) {
			System.out.print(q+" ");
			q++;
		}
		System.out.println("-----------------------");
		//I want to print values from 10 to 1;
		
		int e=10;
		
		while(e>=1) {
			System.out.println(e);
			e--;
		}
	}
}
