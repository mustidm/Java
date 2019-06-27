package com.class01;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAndAfterMethod {

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("beforeMethod");	
		
	}
	
	@Test
    public void melek1() {
	System.out.println("melekbir");
	
}
	@Test
	public void melek2() {
		System.out.println("melekiki");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		
	}
}
