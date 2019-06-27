package class35;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {
	
	public static String name="John";

	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("Give some coffee..");
	}
	
	public static void allStudentsSleeping() throws InterruptedException{
		studentSleeping();
	}
	
	public static void sleepMode() throws InterruptedException{
//		try {
			allStudentsSleeping();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		sleepMode();
	}
}
