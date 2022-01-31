package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class inputdata 
{

	 WebDriver driver;
	 
	 @Test
	public void inputdataintextbox()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Welcome aboard')]"));
		System.out.println(text);
		
	}
}
