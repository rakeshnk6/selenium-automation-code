package seleniumtraining;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroolIn 

{
WebDriver driver;
	
	@Test
public void scrool() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//scroll till buttom of the page
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		//scroll from buttom to the top of the page
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		
		//scroll down till specific pixel
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1500)");
		
		Thread.sleep(5000);
		
		//scroll up to orginal postion
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, -1500)");
		Thread.sleep(5000);
		
		//scroll till specific object
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[518]/td[1]/a")));
		
		
		
		
		
		
}
}
