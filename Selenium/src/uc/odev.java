package uc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cmethod.CommonMethods;

public class odev extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
    //Go to �http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx�
    //Login to the application
    //Verify customer �Susan McLaren� is present in the table
    //Click on customer details
    //Update customers last name
    //Verify updated customers name is displayed in table
    //Close browser
	
	String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	setUpDriver("chrome", url);
	
	sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")), "Tester");
	sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")), "test");
	
	WebElement clickk=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
	clickk.click();
	String isim="Susan McLaren";
	List<WebElement> rows=driver.findElements(By.xpath("//table//tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr/td"));


	for(WebElement row:rows) {
		if(row.getText().contains(isim)) {
			System.out.println("yes there is Susan");
			System.out.println(row.getText());
		}
	}
	
	
	driver.findElement(By.xpath("//tr[6]/td[13]")).click();
	
	WebElement ad=driver.findElement(By.xpath("//input[@value='Susan McLaren']"));
	ad.clear();
	ad.sendKeys("Susan Dama");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("a.btn_light")).click();
	WebDriverWait wait=new WebDriverWait(driver, 2);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr/td"))) ;
	
	rows=driver.findElements(By.xpath("//table//tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr/td"));
	for(WebElement row2:rows) {
	if(row2.getText().contains("Susan Dama")) {
		System.out.println("evet var");
		
	}}
	driver.quit();
	}
}
