package seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintAllData 
{

	WebDriver driver;
	
	@Test
	public void tableData()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.get("https://money.rediff.com/gainers");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	
	int NumberofRows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	int NumberofColumn=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
	
	System.out.println(NumberofRows);
	System.out.println(NumberofColumn);
	
	
	for(int i=1;i<=NumberofRows;i++)
	{
		for(int j=1;j<=NumberofColumn;j++)
		{
			String firstpart="//table[@class='dataTable']/tbody/tr[";
			String secondpart="]/td[";
			String Thirdpart="]";
			
			String Finalpart=firstpart+i+secondpart+j+Thirdpart;
			
			String data=driver.findElement(By.xpath(Finalpart)).getText();
			
			System.out.print(data+" | ");
			
			
		}
		System.out.println();
	}
	
	driver.close();
	
	}
		
	
}

