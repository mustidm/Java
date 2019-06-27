package class26;

public class Phone {
	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}
}
class iPhone extends Phone {

	public void makeCall() {
		System.out.println("iPhone has a face time");
	}
	public void hasCamera() {
		System.out.println("iPhone has dual HD camera");
	}
}
class Nokia extends Phone {
	
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
}
class Samsung extends Phone {
	public void hasCamera() {
		System.out.println("Samsung phone has 3 lenses camera");
	}
}