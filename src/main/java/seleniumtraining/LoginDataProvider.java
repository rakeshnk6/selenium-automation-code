package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProvider 
{
	@Test(dataProvider = "logindata")
	public void testLogin(String Username, String Password)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	
	
	@DataProvider(name="logindata")
	public Object[][] dataset()
	{
		
		return new Object[][] {
			
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
	}
}
