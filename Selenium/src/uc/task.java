package uc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cmethod.CommonMethods;

public class task extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
    
	//Open chrome browser
   //Go to “https://the-internet.herokuapp.com/”
     //Click on “Click on the “Sortable Data Tables” link
    //Verify tables consist of 4 rows and 6 columns
   //Print name of all column headers
   //Print data of all rows
	
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td"));
	List<WebElement> cols=driver.findElements(By.xpath("//table[1]/thead/tr/th"));
	
		for(WebElement siralar:rows) {
			System.out.println(siralar.getText());
		}
		for(int i=1; i<=cols.size(); i++) {
			String melek=driver.findElement(By.xpath("//table[1]/thead/tr/th["+i+"]")).getText();
			System.out.println(melek);
		}
		
}}
