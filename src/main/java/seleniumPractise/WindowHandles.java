package seleniumPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles

{

	
	@Test
	public void WindowHandle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		String parentwindows=itr.next();
		String childwindow=itr.next();
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Rakesh");
		driver.findElement(By.name("UserLastName")).sendKeys("Nayak");
		
		Thread.sleep(3000);
		driver.switchTo().window(parentwindows);
		
		
		
		
	}
		
}
