package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoOfRowsColoumn 

{

	WebDriver driver;
	
	@Test
	public void Countrowcoloumn()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		int numberofRows= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		int numberofColumns= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		
		System.out.println("Number of Rows "+numberofRows);
		System.out.println("Number of Column "+numberofColumns);
		
		
	}
}
