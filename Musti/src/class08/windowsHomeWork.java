package class08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import cmethod.CommonMethods;
public class windowsHomeWork extends CommonMethods {
	    static String Url = "https://the-internet.herokuapp.com/";
		    static String expectedTitleFirstChildWindow = "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		    static String expectedTitleSecondChildWindow = "New Window";
		    static String mainWindowTitle = "The Internet";
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		/*
		 * : ToolsQA Windows verification
Open chrome browser
Go to â€œhttps://the-internet.herokuapp.com/â€�
Click on â€œMultiple Windowsâ€� link
Click on â€œElemental Seleniumâ€�
Verify title of second window is â€œElemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Proâ€�
Close second window
Click on â€œClick Hereâ€� link
Verify title if newly open window is â€œNew Windowâ€�
Close second window
Verify title of second
 window is â€œThe Internetâ€�
Quit browser
NOTE: Selenium execution could be too fast, please use Thread.sleep
		 */
		
		setUpDriver("firefox",Url );
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Set<String> handle= driver.getWindowHandles();
		System.out.println(handle.size());
		Iterator<String> it = handle.iterator();
		while(it.hasNext()) {
			String childOneId= it.next();
			if(!childOneId.equals(parentId)) {
				driver.switchTo().window(childOneId);
				Thread.sleep(2000);
			}
		}
		
				String actualChildOneTitle = driver.getTitle();
				if(actualChildOneTitle.equalsIgnoreCase(expectedTitleFirstChildWindow)) {
					System.out.println("title is displayed ");
				}
				else {
					System.out.println("title is not displayed");
				}

		driver.close();
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		handle=driver.getWindowHandles();
		it =handle.iterator();
		while(it.hasNext()) {
			String childTwoId= it.next();
			if(!childTwoId.equalsIgnoreCase(parentId)) {
				driver.switchTo().window(childTwoId);
				Thread.sleep(2000);
			}
		}
			String actualChildTwoTitle = driver.getTitle();
			if(actualChildTwoTitle .equals(expectedTitleSecondChildWindow)) {
				System.out.println("title is displayed ");
			}
			else {
				System.out.println("title is not displayed ");
			}
			
			
			
		driver.close();
		driver.switchTo().window(parentId);
		String actualParentTitle = driver.getTitle();
		if( actualParentTitle.equals(mainWindowTitle)){
			System.out.println("title is displayed ");
		}
		else {
			System.out.println("title is not displayed ");
		}
		driver.close();
		
		
			
		}
		
		
		

}
