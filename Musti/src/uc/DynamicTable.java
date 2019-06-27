package uc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DynamicTable extends cmethod.CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
	
		
		sendText(driver.findElement(By.cssSelector("input[id$='username']")),"Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		

//		//get number of rows and cols
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));


		for(int a=1; a<=rows.size(); a++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+a+"]")).getText();

			System.out.println(rowText);

		if(rowText.contains("US")) {
				driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+a+"]/td[1]")).click();
			
		}}}}
		

	