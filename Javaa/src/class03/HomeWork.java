package class03;

public class HomeWork {

	public static void main (String[] args) {
		
		String str="hello";
		String str1="Bye";
		
		System.out.print(str);
		System.out.print(str1);
		
		int myNumber=10;
		//Create an int variable called stepOne. 
		//Set it equal to the original number (myNumber) multiplied by itself.
		//int stepOne=100;
		int stepOne =myNumber*myNumber;
		//Create an int variable called stepTwo. 
		//Set it equal to the previous result (stepOne) plus the original number (myNumber).
	
		int stepTwo=stepOne+myNumber;
		System.out.println(stepTwo);
	}
}
