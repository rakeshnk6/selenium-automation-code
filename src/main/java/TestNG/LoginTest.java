package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest 
{

	@BeforeTest
	public void logintoapplication()
	{
		System.out.println("Äpplication login successfull");
	}
	
	@AfterTest
	public void loutofapplication()
	{
		System.out.println("application logout is successfull");
	}
	
	@BeforeMethod
	public void connectDB()
	{
		System.out.println("DB connection established");
	}
	
	@AfterMethod
	public void DiscconectDb()
	{
		System.out.println("DB disconnected");
	}
	@Test (priority = 1, description = "First Test Case")
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test (priority = 2, description = " Second Test case")
	public void test2()
	{
		System.out.println("Test 2");
	}
}
