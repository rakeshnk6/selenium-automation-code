package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots 

{

	@Test
	public void javascriptexec() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		WebElement scrollelement= driver.findElement(By.xpath("//*[@id='main']/div[14]/h2"));
		
		JavascriptExecutor jsec= (JavascriptExecutor) driver;
		jsec.executeScript("arguments[0].scrollIntoView(true);", scrollelement);
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("uuuu/MM/dd HH:MM:SS");
		LocalDateTime now= LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		String screenshotsfilename = dtf.format(now).replace("/", "-").replace(":", "-").replace(" ","-");
		
		System.out.println(screenshotsfilename);
		
	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshot, new File(".//screnshots//"+screenshotsfilename+".png"));
	
	
	
	
	

		
	}
}
