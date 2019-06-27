package uc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import cmethod.CommonMethods;

public class odev1 extends CommonMethods {
	                                                    @Test
public static void main(String[] args) throws InterruptedException {


//	Open chrome browser
//	2.Go to “http://uitestpractice.com/”
//	3.Click on “Forms” link
//	4.Fill out the entire form5.Close the browserMUST USE Functions
	setUpDriver("chrome", "http://uitestpractice.com");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a")).click();
	sendText(driver.findElement(By.xpath("//*[@id=\"firstname\"]")), "mustafa");
	sendText(driver.findElement(By.xpath("//*[@id=\"lastname\"]")), "dama");
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[3]/input")).click();

	
	List<WebElement> hobby=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	
	            for(WebElement hobim:hobby) {
			
				if(hobim.getAttribute("value").endsWith("read") || hobim.getAttribute("value").equals("dance") ){
				 hobim.click();
				}}
	Select select=new Select(driver.findElement(By.cssSelector("select#sel1")));
	List<WebElement> ulke= select.getOptions();
	for(WebElement melek:ulke) {
		if(melek.getText().equals("Egypt")) {
			melek.click();
		}
	}
	  driver.findElement(By.cssSelector("input#datepicker")).click();
	
	  WebElement yillar = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		
		Select obj=new Select(yillar);
		obj.selectByVisibleText("1995");
		
WebElement aylar=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
Select obj2=new Select(aylar);
obj2.selectByIndex(3);
		
	driver.findElement(By.cssSelector("input#datepicker")).click();
			 List<WebElement> tarihler=driver.findElements(By.xpath("//tbody/tr/td"));
			  for(WebElement tarih:tarihler){ 
				  if(tarih.getText().contains("11")) {
			tarih.click(); 
			} }
				
			  driver.findElement(By.cssSelector("input#phonenumber")).sendKeys("+186227171888");
	
				
driver.findElement(By.id("username")).sendKeys("musti");
driver.findElement(By.id("email")).sendKeys("musti@gmail.com");
driver.findElement(By.id("comment")).sendKeys("Benim ismim mustafa. canim benum");
driver.findElement(By.id("pwd")).sendKeys("123456abcd");
driver.findElement(By.xpath("//button[text()='Submit']")).click();



	        	}
	        }
	            
	            
	      