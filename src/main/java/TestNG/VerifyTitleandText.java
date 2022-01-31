package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandText

{
	@Test
	public void titleVerification()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		String Expected= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		String Actual= driver.getTitle();
		
		Assert.assertEquals(Actual, Expected);
		
	}

}
