package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyDown2
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
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[1]/input[1]"));
		
		WebElement age=driver.findElement(By.xpath("//*[@id=\"age\"]"));
		
		WebElement salary=driver.findElement(By.xpath("//*[@id=\"salary\"]"));
		
		
		Actions action=new Actions(driver);
		action.keyDown(username, Keys.SHIFT).sendKeys("RAKESH NAYAK").keyUp(username,Keys.SHIFT).build().perform();
		action.keyDown(age, Keys.SHIFT).sendKeys("30").keyUp(age, Keys.SHIFT).build().perform();
		action.keyDown(salary, Keys.SHIFT).sendKeys("1300000").keyUp(salary, Keys.SHIFT).build().perform();
		
		
		
		
		
		
	}
}
