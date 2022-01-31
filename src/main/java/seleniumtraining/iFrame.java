package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrame 
{
	WebDriver driver;


	@Test
	public void scrool() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/Sujata%20Ghosh/Desktop/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/div/form/div/input[1]")).sendKeys("Rakesh Nayak");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("30");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='frame.html']")));
		
		driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("13500000");
		
	}
	
}
