package iki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cmethod.CommonMethods;

//TC 3: Verify element is enabled1.Open chrome browser2.Go to “https://the-internet.herokuapp.com/”
//3.Click on “Click on the “Dynamic Controls” link4.
//Click on enable button5.
//Enter “Hello” and verify text is entered successfully6.Close the browser

class task3 extends CommonMethods{
	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		
		WebElement musti= driver.findElement(By.xpath("//p[@id='message']"));
		if(musti.isDisplayed()) {
			System.out.println(musti.getText());
		}else {
			System.out.println("no text");
		}}}