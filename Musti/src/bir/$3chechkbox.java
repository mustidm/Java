package bir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class $3chechkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.toolsqa.com/automation-practice-form/");
	
			 List<WebElement> tools= driver.findElements(By.xpath("//input[@name='tool']"));
			 for(WebElement thepsi: tools) {
				if (thepsi.isEnabled()) {
				 System.out.println(thepsi.getAttribute("value"));
				if(thepsi.getAttribute("value").equalsIgnoreCase("QTP") ){
					thepsi.click();
					
				}
				}
			 }
}}
