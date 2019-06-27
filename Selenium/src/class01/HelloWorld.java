package class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cmethod.CommonMethods;

public class HelloWorld extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://facebook.com");
//		driver.get("https://www.amazon.com");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google");
		
		
	}

}
