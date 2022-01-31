package seleniumPractise;

import org.apache.hc.core5.http.nio.CapacityChannel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificates 
{

	
	public static String browser="chrome";
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
		DesiredCapabilities handleSSLrror= new DesiredCapabilities();
		
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			handleSSLrror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handleSSLrror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			ChromeOptions coptions= new ChromeOptions();
			coptions.merge(handleSSLrror);
			
			driver= new ChromeDriver(coptions);
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			handleSSLrror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handleSSLrror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			FirefoxOptions foptions= new FirefoxOptions();
			foptions.merge(handleSSLrror);
			
			driver= new FirefoxDriver(foptions);
		}
		
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			handleSSLrror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handleSSLrror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			EdgeOptions Eoptions= new EdgeOptions();
			Eoptions.merge(handleSSLrror);
			
			driver= new EdgeDriver(Eoptions);
		}
		
		driver.get("https://expired.badssl.com/");
	}
}
