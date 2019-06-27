package class24;

public class Test {
	
	public int test(double a){
		//System.out.println("I am public method");
		return 5;
	}
	
	public void test(){
		System.out.println("I am public method");
	}

	protected void test(String str){
		System.out.println("I am protected method");
	}

	void test(String str, int num){
		System.out.println("I am default method");
	}

	private void test(int num){
		System.out.println("I am private method");
	}
}
