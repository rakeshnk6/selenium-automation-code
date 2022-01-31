package seleniumPractise;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	@Test
	public void javascriptexec() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		String script = "return document.title;";

		JavascriptExecutor jsec = (JavascriptExecutor) driver;

		

		String title = (String) jsec.executeScript(script);
		System.out.println(title);

		// switch to frame
		driver.switchTo().frame("iframeResult");
		jsec.executeScript("myFunction()");
		
		driver.switchTo().alert().accept();

		// higlight the button

		WebElement button = driver.findElement(By.xpath("/html/body/button"));

		jsec.executeScript("arguments[0].style.border='5px solid red'", button);
		
		Thread.sleep(3000);

		// scroll using java script

		driver.navigate().to("https://www.w3schools.com/");

		WebElement exercise = driver.findElement(By.xpath("//*[@id='main']/div[14]/h2"));

		
		jsec.executeScript("arguments[0].scrollIntoView(true);", exercise);
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2)).withMessage("I am waiting for few seconds")
//				.ignoring(NoSuchElementException.class);
//
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.className("w3-button exercise-button w3-round ws-green")));
//

	}

}
