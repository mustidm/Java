package iki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cmethod.CommonMethods;

public class task1 extends CommonMethods {

	
	@Test
	public static void main(String[] args) {
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");

	driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
    
    WebDriverWait wait=new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
WebElement melek = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
 
if (melek.isDisplayed()) {
	String text=melek.getText();
	System.out.println(text);
}else {
	System.out.println("Element is not displayed");
}
driver.quit();
}}

