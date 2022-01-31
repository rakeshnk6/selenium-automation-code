package seleniumtraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtable 

{

	WebDriver driver;
	
	@Test
	public void webTableData()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		int NumberOfRows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
//		System.out.println("Number of Rows are ="+NumberOfRows);
//		
//		int NumberOfCols= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
//		
//		System.out.println("Number of Columns are "+NumberOfCols);
//		
//		for(int i=0;i<NumberOfRows;i++)
//		{
//			for(int j=0;j<NumberOfCols;j++)
//			{
//				System.out.println();
//			}
//		}
		
		/* Print a specific data from the table */
		
			String text=driver.findElement(By.xpath("//a[contains(text(),'OnMobile Global Ltd.')]/parent::*/following-sibling::td[3]")).getText();
				
		System.out.println("data is :"+text );
		
	}
	
	
}
