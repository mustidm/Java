package class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cmethod.CommonMethods;

public class googleDemo extends CommonMethods {

	public static void main(String[] args) throws Exception {
		setUpDriver("chrome","http://google.com");
		TakesScreenshot camera=(TakesScreenshot)driver;
		File selfire=camera.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(selfire, new File("C:\\Users\\Mustafa\\Desktop\\CCC\\bbbbbbb.png"));

	}
}
