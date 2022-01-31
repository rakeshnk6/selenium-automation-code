package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown
{
	@Test
	public void multiselect() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='From']")));
		
		Thread.sleep(3000);
		
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Sydney");
		
		Thread.sleep(3000);
		
		from.sendKeys(Keys.DOWN);
		
		Thread.sleep(3000);
		
		from.sendKeys(Keys.ENTER);
		
		
		
		
	}
}
