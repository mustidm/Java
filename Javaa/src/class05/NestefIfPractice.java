package class05;

public class NestefIfPractice {

	public static void main(String[] args) {
	/*check if user has credit card--> 
	 * check what is the balance if balance is more than 1000--> pay off now
	 * else "you are good"*/
		boolean creditCard=true;
		int balance =900;
		
		if (creditCard) {
				System.out.println("Let's check the balance");
				if(balance>=1000) {
					System.out.println("pay off now");
				}else {
					System.out.println("you are good");
				}
		}else {
			System.out.println("Do you want a credit card");
		}
	}
}
