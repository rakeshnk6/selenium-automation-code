package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyradioButton 

{
	WebDriver driver;


	@Test
	public void scrool() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]/span[1]")).click();
		
		String classname=driver.findElement(By.xpath("//div[@class='widget']//fieldset//label[@for='radio-1']")).getAttribute("class");
		
		System.out.println(classname);
		if(classname.contains("ui-checkboxradio-checked ui-state-active"))
		{
			Assert.assertTrue(true," radio button is selected");
			
		}
		else
		{
			Assert.assertTrue(false,"radio button is not checked");
		}
		
	}
}
