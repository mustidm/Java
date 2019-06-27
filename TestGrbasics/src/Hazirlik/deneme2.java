package Hazirlik;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class deneme2 extends CommonMethods{
	
	
	@Parameters("browser")
	@Test
	public void giris(String browser) {
   if(browser.equals("firefox")) {
	setUpDriver(browser, "https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();

   
   
   }else  if(browser.equals("chrome")) {
	
	
	
	setUpDriver(browser, "https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
}

	
	
	
	
	
	}
	
	
	
	
	
	
}