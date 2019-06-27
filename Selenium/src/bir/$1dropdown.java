package bir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//facebook
public class $1dropdown {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\selenium\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();
// WebElement musti=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
 
WebElement gunler=driver.findElement(By.cssSelector("select#day"));
Select gun=new Select(gunler);
List<WebElement> sec=gun.getOptions();
int a=sec.size()-1;
gun.selectByIndex(10);

Thread.sleep(4000);


WebElement aylar=driver.findElement(By.cssSelector("select#month"));
Select ay=new Select(aylar);
List<WebElement> aylarinlistesi=ay.getOptions();
int b=aylarinlistesi.size()-1;
ay.selectByIndex(8);
ay.selectByVisibleText("Ara");
 
}
}
