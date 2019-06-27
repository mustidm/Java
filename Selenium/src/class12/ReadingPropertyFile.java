package class12;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import cmethod.CommonMethods;

public class ReadingPropertyFile extends CommonMethods{

	Properties prop;
	
	@Test
	public void readFile() {
		
		String filePath="C:\\Users\\Mustafa\\eclipse-workspace\\Selenium\\src\\class12\\configs\\credentials.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));

		sendText(driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")), "Admin");
	    sendText(driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")), "admin123");
	     driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	    

	}
}