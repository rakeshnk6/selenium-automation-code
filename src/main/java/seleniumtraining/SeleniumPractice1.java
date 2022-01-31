package seleniumtraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice1
{
	
	@Test
	public void BrowserLaunch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sujata%20Ghosh/Desktop/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();


		//enter data in text box
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[1]/input[1]")).sendKeys("Rakesh Nayak");
		driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("30");
		
		//select select box
		
		WebElement selectelement=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[1]/select"));
		
		Select selct=new Select(selectelement);
		selct.selectByVisibleText("Opel");
		
		Thread.sleep(3000);
		// eneter data in the Text area
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[5]/textarea")).sendKeys("This pandameic is going to end soon");
		
		//select check box
		
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/div[1]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/div[3]/label/input")).click();
		
		Thread.sleep(3000);
		
		//select radio button 
		
		driver.findElement(By.xpath("//*[@id=\"optionsRadios3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"optionsRadiosInline3\"]")).click();
		Thread.sleep(3000);
		
		// selectbox code
		
		WebElement slt=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[10]/select"));
		Select s=new Select(slt);
		s.selectByVisibleText("4");
		Thread.sleep(3000);
		
		
		//--- select multiple element
		
		WebElement d=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div[2]/div/div[1]/form/div[11]/select"));
		
		Select se=new Select(d);
		
		List<WebElement> t=se.getOptions();
		
		for(WebElement w:t)
		{
			System.out.println("Öptions are "+w.getText());
			
		}
		
		se.selectByIndex(1);
		se.selectByVisibleText("4");
	}
}
