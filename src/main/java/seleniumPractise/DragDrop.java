package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop

{
	@Test
	public void DragDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));	
		driver.switchTo().frame(frame);
		
		
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		
		
	}
}
