package class07;


import org.openqa.selenium.By;

import cmethod.CommonMethods;



public class iframe extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
		
		driver.switchTo().defaultContent();
		
		boolean Switch =driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
		if(Switch==true) {
			driver.close();	
		}
		
	

	}

}
