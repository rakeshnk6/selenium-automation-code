package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick 

{
	@Test
	public void rightclick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		Actions act= new Actions(driver);
		
		act.contextClick().perform();
		
		
	}
}
