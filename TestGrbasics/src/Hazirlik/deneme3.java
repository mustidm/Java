package Hazirlik;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utills.CommonMethods;

public class deneme3 extends CommonMethods{

	@Parameters({"browser","Url","UserN","pass"})
	@BeforeMethod
	public void giris(String browser,String Url, String UserN, String pass) {
		setUpDriver(browser, Url);
		
   sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")), UserN);
   driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys(pass);
   driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
	}
	
	@Test
	public void testt() {
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[1]/h1"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("selam");
	}
	
	@DataProvider(name ="huseyin")

	public Object [][] setUpData() {
		
		Object [] [] data = new Object[2][9]	;
		
		data[0][0]="100";
		data[0][1]="John Smith";	
		data[0][2]="123 street ";
		data[0][3]="Ashburn";	
		data[0][4]="Va";
		data[0][5]="20147";	
		data[0][6]="Visa";
		data[0][7]="0000";	
		data[0][8]="00/00";	
		
		
		data[1][0]="200";
		data[1][1]="Mary Smith";	
		data[1][2]="123 street ";
		data[1][3]="Ashburn";	
		data[1][4]="Va";
		data[1][5]="20147";	
		data[1][6]="MasterCard";
		data[1][7]="0001";	
		data[1][8]="01/00";	
		
				
	    return data;
		
	}
	@Test(dataProvider = "huseyin")
	public void  testUsers(String deger, String isim, String street, String city, String state, String zip, String card , String cardNr, String date) throws IOException {
	driver.findElement(By.xpath("//a[text()='Order']")).click();
	driver.findElement(By.xpath("//input[contains(@id,'Quantity')]")).sendKeys(deger);
	driver.findElement(By.xpath("//input[contains(@id,'Name')]")).sendKeys(isim);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox2')]")).sendKeys(street);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox3')]")).sendKeys(city);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox4')]")).sendKeys(state);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox5')]")).sendKeys(zip);
	driver.findElement(By.xpath("//input[contains(@value,'"+card+"')]")).click();
	driver.findElement(By.xpath("//input[contains(@id,'TextBox6')]")).sendKeys(cardNr);
	driver.findElement(By.xpath("//input[contains(@name,'TextBox1')]")).sendKeys(date);
	driver.findElement(By.xpath("//a[contains(@id,'InsertButton')]")).click();
//	if(isim.contains("John Smith")) {
//	takeScreenshot("taskOne", "smartbearsoftwareUserOne");
//	}
//	else  {
//		takeScreenshot("taskOne", "smartbearsoftwareUserTwo");
//	}
			
	}
		
@AfterMethod
public void close() {
	
}

}
