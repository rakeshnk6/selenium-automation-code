package seleniumPractise;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluntWait 

{
	
	@Test
 public void waitfluent()
 {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
	driver.manage().window().maximize();
	
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	
	
	Actions act= new Actions(driver);
	
	act.moveToElement(electronics).perform();
	
	Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).
			withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).
			withMessage("Rakesh Nayak is doing this automation").ignoring(NoSuchElementException.class);
	
	
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
	
	
	
	
 }
}
