package seleniumtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multiplewindows 

{
	WebDriver driver;

	@Test
	public void multiplewindow() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath
				("//*[@id=\"social_block\"]/ul/li[3]/a")).click();
		
		
		Set<String> windows=driver.getWindowHandles();
		
			
		Iterator<String> itr=windows.iterator();
		String parentId= itr.next();
		String childId=itr.next();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		driver.switchTo().window(childId);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		driver.switchTo().window(parentId);
		
		
	}	
		
}
