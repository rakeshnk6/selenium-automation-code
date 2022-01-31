package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyDown3 
{
	
	WebDriver driver;


	@Test
	public void scrool() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Sujata%20Ghosh/Desktop/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		WebElement tablelink= driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a"));
		
		Actions action= new Actions(driver);
		
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(tablelink).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		
		
		 
		 
		 
	}

}
