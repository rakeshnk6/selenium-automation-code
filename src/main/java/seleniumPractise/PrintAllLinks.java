package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks 
{
	@Test
	public void multiselect() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
	
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		
		System.out.println(" Total Number of Links are ="+alllinks.size());
		
		for(int i=0;i<alllinks.size();i++)
		{
			System.out.println("Link "+i+" is " +alllinks.get(i).getAttribute("href"));
			System.out.println("Link Url are "+alllinks.get(i).getText());
		}
		
		driver.close();
		
		
	}

}
