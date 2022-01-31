package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover 

{
	@Test
	public void Mousehover() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	
		WebElement mouseHover=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(mouseHover).perform();
		Thread.sleep(10000);
		
		
		WebElement mouseHover2=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
		act.moveToElement(mouseHover2).perform();
		
	}
}
