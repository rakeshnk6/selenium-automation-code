package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cutpaste 

{
	@Test
	public void cutpaste() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://extendsclass.com/text-compare");
		driver.manage().window().maximize();
		WebElement sourcearea=driver.findElement(By.xpath("//*[@id='dropZone']/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
		
		WebElement desinationarea= driver.findElement(By.xpath("//*[@id='dropZone2']/div[2]/div/div[6]"));
		
		Actions act= new Actions(driver);
		
		Thread.sleep(3000);
		
	act.keyDown(sourcearea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	
	Thread.sleep(3000);
	
	act.keyDown(desinationarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	
		
		
	}
}
