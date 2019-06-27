package class02;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cmethod.CommonMethods;

public class close extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cnn.com");
		//driver.close();
		//driver.quit();
	}

}
