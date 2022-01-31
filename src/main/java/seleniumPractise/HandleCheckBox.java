package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox 
{
	@Test
	public void checkbox() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//input[@id='doi0']")));
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.name("interest_market_c")));
		
		Boolean check1=driver.findElement(By.name("interest_market_c")).isSelected();
		System.out.println(check1);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.name("interest_serve_c")));
		
		
		
		
		
		
	}
}
