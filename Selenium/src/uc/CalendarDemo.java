package uc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cmethod.CommonMethods;



public class CalendarDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		String url="https://jqueryui.com/datepicker/";
		setUpDriver("chrome", url);
		WebElement melek = driver.findElement(By.cssSelector("iframe.demo-frame"));
		switchToFrame(melek);
		driver.findElement(By.cssSelector("input#datepicker")).click();
		List<WebElement> gun=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
	
		for(WebElement gunler:gun) {
		
			if(gunler.getText().equals("26")) {
			gunler.click();
			}
		}


		
	}}
	























//		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
//		switchToFrame(frame);
//
//		driver.findElement(By.id("datepicker")).click();
//		
//		String expectedDate="30";
//		
//		//get all cells
//		List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
//		for (WebElement cell: cells) {
//
//		
//			if (cell.getText().equals(expectedDate)) {
//				cell.click();
//			}
//		}
//		Thread.sleep(7000);
//		driver.quit();
//}}
//
//		
//		
		
		
		
		
		
		
		
	