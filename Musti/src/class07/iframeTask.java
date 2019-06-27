package class07;

import org.openqa.selenium.By;

import cmethod.CommonMethods;

public class iframeTask extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Open chrome browser
Go to â€œhttps://www.toolsqa.com/iframe-practice-page/â€�
Click on â€œ Guest Blogsâ€� link inside first frame
Verify element â€œInteractionsâ€� is present in second frame
Navigate to Home Page
Quit browser

		 */
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(inter==true) {
			driver.switchTo().defaultContent();
			driver.close();
		}
		
		

	}

}
