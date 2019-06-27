package Hazirlik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class aaa {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://google.com");
	
}
}
