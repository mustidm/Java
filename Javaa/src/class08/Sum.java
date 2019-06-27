package class08;

public class Sum {
	
	public static void main(String[] args) {

		int sum=0;
		
		for (int i=1; i<=5; i++) {
			
			sum=sum+i;
			System.out.println(sum);
			}
		
		System.out.println(sum);//6, 5, 15, 7, 1
		
		/*find sum of all even numbers from 1 to 100 inclusive*/
		
		int sumAll=0;
		
		for (int y=10; y<=50; y+=10) {
			sumAll=sumAll+y;
		}
		
		System.out.println(sumAll);
		
	}
}
