package seleniumtraining;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllLinks 

{
	WebDriver driver;


	@Test
	public void getAllLinks()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		ArrayList<String> data=new ArrayList<String>();
		for(int i=0;i<links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
			data.add(links.get(i).getAttribute("href"));
			
			System.out.println(links.get(i).getAttribute("href"));
		
		}
		
		
		System.out.println(data.size());
		
		
		
	}
		
}
