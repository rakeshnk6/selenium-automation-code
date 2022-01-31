package seleniumtraining;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookies 
{
	WebDriver driver;


	@Test
	public void scrool() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().deleteCookieNamed("__gads");	
		Set<Cookie>cookies=driver.manage().getCookies();
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie);
		}
		
		driver.close();
		
}
}
