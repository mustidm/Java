package class11;


	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import cmethod.CommonMethods;

	public class deneme extends CommonMethods {
	    
	public static void main(String[] args) throws InterruptedException, IOException {
	        
	        String url="http://www.facebook.com";
	        setUpDriver("chrome", url);
TakesScreenshot melek=(TakesScreenshot)driver;
File Mustafa= melek.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Mustafa, new File("resimler\\face.jpg"));
	
	
	
	
	}}