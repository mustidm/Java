package bir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class $2radiochechk {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.toolsqa.com/automation-practice-form/");

	List<WebElement> radio= driver.findElements(By.xpath("//input[@name='exp']"));
	for(WebElement hepsi:radio) {
		if(hepsi.isEnabled()) {
			hepsi.click();
			Thread.sleep(2000);
		}
	}
driver.quit();

}
}
