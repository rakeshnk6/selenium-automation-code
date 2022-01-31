package seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait 

{
	
	@Test
 public void waitexplicit()
 {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
	driver.manage().window().maximize();
	
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	
	
	Actions act= new Actions(driver);
	
	act.moveToElement(electronics).perform();
	
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
	
	
	
	
 }
}
