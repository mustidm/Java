package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cmethod.CommonMethods;
public class DriversTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://google.com");
		driver.quit();
		
	}
}
