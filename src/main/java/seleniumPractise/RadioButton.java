package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton

{
	@Test
	public void radiobutton() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radio1=driver.findElement(By.id("redeemFlights"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",radio1);
		Thread.sleep(3000);
		
	
		System.out.println(radio1.isSelected());
	
	}
}
