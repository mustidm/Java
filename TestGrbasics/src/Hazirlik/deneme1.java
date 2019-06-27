package Hazirlik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Hazirlik.asd;

public class deneme1 extends asd {
@BeforeMethod
public void setUP() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	asd obje=new asd();
}

@Test(dataProvider ="saucedata")
public void TestUsers(String ID, String Pass) {
	WebDriver driver = new ChromeDriver();
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(ID);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Pass);
	driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
	
	WebElement Title=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div"));
	Assert.assertTrue(Title.isDisplayed()); 
	System.out.println(ID);
}



@AfterMethod
public void close() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.close();
}
}
