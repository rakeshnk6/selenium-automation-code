package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectClass
{
WebDriver driver;

@Test
public void selectbox() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
	WebElement selectboxdata= driver.findElement(By.xpath("//*[@id=\"Carlist\"]"));
	Select select= new Select(selectboxdata);
	select.selectByVisibleText("Audi");
	
	
	
	
	
	
	
}
}
