package class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		//2 ways to create a String:
		//1 way - using String literal
		
		String str="Hello";
		
		//2 way 
		String str2=new String("Bye");
		
		str=str.toUpperCase();
		str=str.replace("O", "a");
		
		System.out.println(str);
	}
}
