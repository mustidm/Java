package class17;

import class18.ScannerMethod;

public class Application {

	public static void main(String[] args) {
//		ScannerMethod scnMthd = new ScannerMethod();
//		System.out.println(scnMthd.sum(125, 150));
		
		Application app = new Application();
		
		System.out.println(app.example6('a'));

	}

	void example() {

		System.out.println("No return value and NO Parameters");
	}

	void example2(String name) {

		System.out.println("No return value but with Parameter : " + name);
	}

	boolean example3() {

		System.out.println("With return value and NO Parameters");
		return true;
	}

	String example4(String name) {

		System.out.println("No return value but with Parameter : " + name);
		
		return name;
	}
	
	
	boolean example5(String name) {

		System.out.println("No return value but with Parameter : " + name);
		
		return false;
	}
	
	
	long example6(char name) {

		System.out.println("No return value but with Parameter : " + name);
		
//		name = 1;
		
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	

}
