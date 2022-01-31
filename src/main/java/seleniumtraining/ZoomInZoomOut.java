package seleniumtraining;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOut
{
	WebDriver driver;


@Test
public void scrool() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.get("https://money.rediff.com/gainers");
	driver.manage().window().maximize();
	
	((JavascriptExecutor)driver).executeScript("document.body.style.zoom='40%'");
	
	Thread.sleep(3000);
	
	((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
	
	

}

}
