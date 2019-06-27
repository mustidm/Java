package class04;

public class Task2 {

	public static void main(String[] args) {
		double mortageRate = 4.8;
		int mortgagePrice = 300000;
		
		if (mortageRate<4.5) {
			System.out.println("I will consider buying");
			if(mortgagePrice<200000) {
				System.out.println("I am paying with cash");
			}else {
				System.out.println("I will take a loan");
			}
		}else {
			System.out.println("I will not buy that house");
		}
	}
}
