package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_XMLData_Read 

{
	
	public static WebDriver driver;
	
	
	@Parameters ({"browser"})
	@Test
	public void launchApplication(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\'login-button\']")).click();
		
		
	}

}
