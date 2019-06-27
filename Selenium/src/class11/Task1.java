package class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cmethod.CommonMethods;

public class Task1 extends CommonMethods{
	static String expected="File uploaded!";
public static void main(String[] args) {
	setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
	 
	String filePath="C:\\Users\\Mustafa\\Pictures\\pubg.jpg";
     driver.findElement(By.cssSelector("#gwt-debug-cwFileUpload")).sendKeys(filePath);
     driver.findElement(By.cssSelector("button.gwt-Button")).click();
     String text=getAlertText();
     if(text.equals(expected)) {
    	 System.out.println("File is uploaded");
     }else {
    	 System.out.println("File is not uploaded");
     }
     acceptAlert();
TakesScreenshot camera=(TakesScreenshot)driver;
File scr=camera.getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(scr, new File("screenshots/upload.jpg"));
} catch (IOException e) {
	e.printStackTrace();
	System.out.println("unable to take screenshoot");
}
driver.quit();
}
//Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//Upload file
//Verify file got successfully uploaded and take screenshot

}
