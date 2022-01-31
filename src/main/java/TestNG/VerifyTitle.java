package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle

{
	@Test
	public void titleVerification() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		String Expected = "Electronics,  Fashion, Collectibles & More | eBay";

		String Actual = driver.getTitle();

		SoftAssert soft = new SoftAssert();
		System.out.println("Tittle verification");
		soft.assertEquals(Actual, Expected, "Title verification failed");

		String ExpectedText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");

		String ActualText = "Search";
		System.out.println("Text Verification");
		soft.assertEquals(ActualText, ExpectedText, "Text verfification failed");

		System.out.println("closing browser");
		driver.close();
		soft.assertAll();
	}

}
