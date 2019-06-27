package class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cmethod.CommonMethods;

public class taskOneWithLocators extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Yok oyle bisey");
	
		driver.findElement(By.name("pass")).sendKeys("Syntax123");
	
		WebElement giris=driver.findElement(By.xpath("//*[@id=\"u_0_e\"]"));
		giris.sendKeys("onur");
		Thread.sleep(300);
		sendText(driver.findElement(By.xpath("//*[@id=\"u_0_g\"]")), "bilmem ne");
		Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("+905070052350");

Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
List<WebElement> yillar= driver.findElements(By.xpath("//*[@id=\"year\"]/option"));
for(WebElement yil: yillar) {
	if(yil.getText().equals("1999")) {
		yil.click();
	}
}

driver.navigate().to("https://www.youtube.com/watch?v=tovNLC9g9Lk");
driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]")));
WebElement hoverOver = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]"));
Actions action= new Actions(driver);
action.moveToElement(hoverOver).perform();
	
	
	driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]/div[2]/button[9]")).click();
	}

}
