package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selectbox 
{
WebDriver driver;


@Test
public void selectbox() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.get("https://phptravels.net/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//*[@id=\'select2-hotels_city-container\']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\'select2-hotels_city-container\']")).sendKeys("Bhu");
	
	Thread.sleep(3000);
	
	List<WebElement> cities=driver.findElements(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span[2]/ul/li"));
	
	for(int i=0;i<cities.size();i++)
	{
		WebElement element=cities.get(i);
		String text=element.getText();
		
		System.out.println(text);
		if(text.equals("Bhubaneswar,India"))
		{
			element.click();
			break;
		}
		
		
	}
}

@Test
public void selectStayDate()
{
	driver.findElement(By.xpath(""));
}
	
}

