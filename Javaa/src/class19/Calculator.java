package class19;

public class Calculator {
	
	
//	Let's create a class called Calculator
//
//	Have methods that take three inputs and return the result
//
//	and return the sum, average, min and max
	
	
	int sum(int a, int b, int c) {
		return(a+b+c);
		
	}
	
	int average(int a, int b, int c) {
		return(a+b+c)/3;
		
	}
	
	int min(int a, int b, int c) {
		
		int min = a;
		
		if(b<a) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
			
		return min;
		
	}
	
	int max(int a, int b, int c) {
		int max = a;
		
		if(b>a) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
			
		return max;
		
	}
	
	

}
