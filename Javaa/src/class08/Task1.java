package class08;

public class Task1 {
	
	public static void main(String[] args) {
	/*Print even numbers between 20 and 50 (2 ways)*/
		//1 way
		for (int i=20; i<=50; i+=2) {
			System.out.println(i);
		}
		//2 way
		for (int i=20; i<=50; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("--------------  ++++ ----------");
		/*Print odd numbers between 20 and 50 (2 ways)*/
		//1 way
		for(int a=20; a<=50; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
		} 
		//2 way
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
	
		/*Print even numbers between 50 and 20 (2 ways)*/
		
		for(int k=50; k>=20; k--) {
			if (k%2==0) {
				System.out.println(k);
			}
		}
		
		
	}
}
