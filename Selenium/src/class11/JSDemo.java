package class11;

import org.openqa.selenium.JavascriptExecutor;

import cmethod.CommonMethods;

public class JSDemo extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	String url="https://www.toolsqa.com/automation-practice-form/";
setUpDriver("chrome", url);

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,550)");

Thread.sleep(5000);
driver.quit();
}
}
