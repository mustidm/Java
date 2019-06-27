package class23;

public class MainMethodOverload {
	
	public static void main(String[] args) {
		System.out.println("I am main method with string argument array");
		main();
		main("Hello");
		main(10);
	}
	
	public static void main() {
		System.out.println("I am main method with no parameters");
	}
	
	public static void main(String args) {
		System.out.println("I am main method with String parameters");
	}
	
	public static void main(int a) {
		System.out.println("I am main method with int parameters");
	}
}
