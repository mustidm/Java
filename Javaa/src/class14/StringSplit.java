package class14;

public class StringSplit {

	public static void main(String[] args) {
		
		String str="Welcome Syntax Students";
		String[] array=str.split("Syntax");
		System.out.println("The length of the array is "+array.length);
		for(String substring: array) {
			System.out.println(substring);
		}
		System.out.println("-----------");
		for(int i=0;i<array.length; i++ ) {
			System.out.println(array[i]);
		}
		//("\\?")//[!?]

	}
}
