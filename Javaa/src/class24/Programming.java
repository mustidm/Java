package class24;

public class Programming {
	public Programming() {
		System.out.println("I love proggraming languages");
	}

	public Programming(String str) {
		System.out.println("I love " + str);
	}

	public static void main(String[] args) {
		Programming obj = new Programming();
		Programming obj1 = new Programming("Java");
	}
}
