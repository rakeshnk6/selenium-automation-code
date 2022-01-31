package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calender

{
	
	WebDriver driver;
	String month= "November 2022";

	
	
	@Test
	public void selectTwowayRadioButton()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[2]/div[1]")).click();
		
	}
	@Test
	public void selectcalender() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']//div[1]//div[2]//div[2]")).click();
		
WebElement mon= driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[6]/div/div[1]/div"));

System.out.println("Month displaying now is" + mon.getText());
while(true)
{
	if(mon.getText().equals(month))
	{
		Thread.sleep(5000);
		break;
	}
	else
	{
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		
	}
}

driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]\r\n"
		+ "	/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]\r\n"
		+ "		/div/div[6]/div/div[3]/div[3]/div[2]/div/div")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[6]/div/div[3]/div[3]/div[6]/div/div")).click();




}
}
