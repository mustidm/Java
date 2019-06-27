package ders1;

public class bir {
public static void main(String[] args) {
	int[] numbers= {200, 789, 4055 ,100,989};
	int buyuksayi=0;
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i]>buyuksayi) {
			buyuksayi=numbers[i];
		
		}
			
	}
System.out.println(buyuksayi);
}
}
