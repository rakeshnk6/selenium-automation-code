package seleniumtraining;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCookie 
{

	WebDriver driver;


	@Test
	public void scrool() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Cookie cook=new Cookie("Rakesh Nayak", "Covid Positive");
		driver.manage().addCookie(cook);
		Set<Cookie>cookies= driver.manage().getCookies();
		
		for(Cookie cooks:cookies)
		{
			System.out.println(cooks);
		}
		
		
		
	}
}
