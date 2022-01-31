package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	@Test
	public void multiselect() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]"));
		action.moveToElement(element).click();

		WebElement item = driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select"));

		Select s = new Select(item);
		WebElement firstItem = s.getFirstSelectedOption();
		System.out.println(firstItem.getText());

		Thread.sleep(2000);

		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByVisibleText("251 - 500 employees");

		Thread.sleep(2000);

		List<WebElement> allitems = s.getAllSelectedOptions();

		System.out.println(allitems.size());

		Thread.sleep(2000);

		s.selectByIndex(7);

	}
}
