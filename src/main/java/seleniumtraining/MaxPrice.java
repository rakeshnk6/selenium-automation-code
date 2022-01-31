package seleniumtraining;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MaxPrice
{

	WebDriver driver;
	
	@Test
	public void getmaxprice() throws ParseException
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.get("https://money.rediff.com/gainers");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			

			
			int rowdata=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]")).size();
			
			ArrayList<Integer> pricelist=new ArrayList<Integer>();
			
			for(int i=1;i<rowdata;i++)
			{
				String firstPart="//table[@class='dataTable']/tbody/tr[";
				String Secondpart="]/td[4]";
				
				String finalpart=firstPart+i+Secondpart;
				
				System.out.println(finalpart);
				
				String price=driver.findElement(By.xpath(finalpart)).getText();
				NumberFormat numberformat=NumberFormat.getInstance();
				Number num=numberformat.parse(price);
				
				price=num.toString();
				Double m=Double.parseDouble(price);
				int intprice=m.intValue();

				
				pricelist.add(intprice);
				
			}
			
			Collections.sort(pricelist);
			System.out.println(pricelist);
			System.out.println(pricelist.get(pricelist.size()-1));
			
			
			
			
	}
}
