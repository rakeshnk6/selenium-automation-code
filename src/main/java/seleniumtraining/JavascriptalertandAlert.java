package seleniumtraining;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptalertandAlert 

{
	WebDriver driver;


	@Test
	public void scrool() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/Sujata%20Ghosh/Desktop/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a")).click();
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().dismiss();
		
		String text=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		if(text.equalsIgnoreCase("You pressed Cancel!"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false,"actual data is "+text);
		}
		
		
		Thread.sleep(3000);
		driver.get("file:///C:/Users/Sujata%20Ghosh/Desktop/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
	
}
