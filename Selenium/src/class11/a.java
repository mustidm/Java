package class11;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cmethod.CommonMethods;

	public class a extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
	        
	        String url="http://the-internet.herokuapp.com";
	        setUpDriver("chrome", url);
	        
	        driver.findElement(By.linkText("File Upload")).click();
	        Thread.sleep(3000);
	        
	        String filePath="C:\\Users\\Mustafa\\Pictures\\pubg.jpg";
	        driver.findElement(By.id("file-upload")).sendKeys(filePath);
	        driver.findElement(By.id("file-submit")).click();
	        
	        boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
	        
	        if (isDisplayed) {
	            System.out.println("File uploaded successfully");
	        }else {
	            System.out.println("File uploaded successfully");
	        }
	        
	        TakesScreenshot camera=(TakesScreenshot)driver;
			File selfire=camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(selfire, new File("screenshots/Gosd.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	        Thread.sleep(2000);
	        driver.quit();

	}
	}