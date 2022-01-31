package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseover {

	WebDriver driver;

	@Test
	public void mouse() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sujata Ghosh\\Downloads\\Eclipse and selenium jars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		Actions action= new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li/a")).click();
		
		
		
		
	}
}
		