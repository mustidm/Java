package iki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cmethod.CommonMethods;

public class task2 extends CommonMethods {
public static void main(String[] args) {
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	
//	TC 2: Verify element is clickable1.Open chrome browser2.
//	Go to “https://the-internet.herokuapp.com/”3.Click on “Click on the “Dynamic Controls” link4.
//		Select checkbox and click Remove5.
//		Click on Add button and verify “It's back!” text is displayed6.Close the browser
	
	driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
	driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input")).click();
	driver.findElement(By.xpath("//button[text()='Remove']")).click();
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add']")));
	//WebElement melek= driver.findElement(By.xpath("//button[text()='Add']"));
	//melek.click();
	WebDriverWait wait=new WebDriverWait(driver, 2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
	
	WebElement mustafa= driver.findElement(By.cssSelector("p#message"));
	if(mustafa.isDisplayed()) {
		System.out.println(mustafa.getText());
	}else {
		System.out.println("no message");
		
	}
}
}
